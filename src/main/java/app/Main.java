package app;

import app.config.HibernateConfig;
import app.entities.Course;
import app.entities.Person;
import app.entities.Student;
import app.entities.StudentStatus;
import app.persistence.*;
import jakarta.persistence.EntityManagerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDate;
import java.time.LocalTime;


public class Main
{
    public static void main(String[] args)
    {
        Logger LOGGER = LoggerFactory.getLogger(Main.class);
        EntityManagerFactory emf = HibernateConfig.getEntityManagerFactory();
        PersonDAO personDAO = new PersonDAOImpl(emf);
        StudentDAO studentDAO = new StudentDAOImpl(emf);
        CourseDAO courseDAO = new CourseDAOImpl(emf);

        Person person = Person.builder()
                .name("Morten")
                .age(36)
                .build();

        Student student = Student.builder()
                .name("Hans")
                .address("Rømersgade 7")
                .email("hansi@hansify.dk")
                .phone("12345678")
                .studentStatus(StudentStatus.ACTIVE)
                .dateOfBirth(LocalDate.of(1989,5,17))
                .dateOfEnrollment(LocalDate.of(2026,2,3))
                .build();

        Course course = Course.builder()
                .name("Data structures")
                .classroom("3.4")
                .teacher("Jon Bertelsen")
                .semester("3. semester")
                .timeOfCoruse(LocalTime.of(9,00))
                .build();

        Person personFromDB = personDAO.createPerson(person);
        Student studentFromDB = studentDAO.create(student);
        Course courseFromDB = courseDAO.create(course);

        LOGGER.info("Testing person from db: {}", personFromDB);
        LOGGER.info("Testing student from db: {}", studentFromDB);
        LOGGER.info("Testing course from db: {}", courseFromDB);

        studentFromDB.setAddress("Firskovsvej 11");
        studentFromDB.setName("Fie");
        Student updatedStudent = studentDAO.update(studentFromDB);

        LOGGER.info("Updated student from db: {}", updatedStudent);
    }
}