package app;

import app.config.HibernateConfig;
import app.entities.Person;
import app.entities.Student;
import app.entities.StudentStatus;
import app.persistence.PersonDAO;
import app.persistence.PersonDAOImpl;
import app.persistence.StudentDAO;
import app.persistence.StudentDAOImpl;
import jakarta.persistence.EntityManagerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDate;


public class Main
{
    public static void main(String[] args)
    {
        Logger LOGGER = LoggerFactory.getLogger(Main.class);
        EntityManagerFactory emf = HibernateConfig.getEntityManagerFactory();
        PersonDAO personDAO = new PersonDAOImpl(emf);
        StudentDAO studentDAO = new StudentDAOImpl(emf);


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

        Person fromDB = personDAO.createPerson(person);
        Student studentFromDB = studentDAO.create(student);

        LOGGER.info("Testing person from db: {}", fromDB);
        LOGGER.info("Testing stundent from db: {}", studentFromDB);
    }
}