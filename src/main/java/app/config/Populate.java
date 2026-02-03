package app;

import app.entities.Course;
import app.entities.Student;
import app.entities.StudentStatus;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Populate {

    public static List<Student> getStudents() {
        List<Student> students = new ArrayList<>();

        students.add(Student.builder()
                .name("Emma Nielsen")
                .address("Nørrebrogade 12")
                .email("emma@student.dk")
                .phone("20123456")
                .studentStatus(StudentStatus.ACTIVE)
                .dateOfBirth(LocalDate.of(2002, 3, 15))
                .dateOfEnrollment(LocalDate.of(2023, 9, 1))
                .build());

        students.add(Student.builder()
                .name("Noah Hansen")
                .address("Vesterbrogade 45")
                .email("noah@student.dk")
                .phone("30234567")
                .studentStatus(StudentStatus.ACTIVE)
                .dateOfBirth(LocalDate.of(2001, 7, 22))
                .dateOfEnrollment(LocalDate.of(2023, 2, 1))
                .build());

        students.add(Student.builder()
                .name("Sofia Andersen")
                .address("Østerbrogade 78")
                .email("sofia@student.dk")
                .phone("40345678")
                .studentStatus(StudentStatus.INACTIVE)
                .dateOfBirth(LocalDate.of(2003, 1, 10))
                .dateOfEnrollment(LocalDate.of(2024, 9, 1))
                .build());

        students.add(Student.builder()
                .name("William Jensen")
                .address("Amagerbrogade 34")
                .email("william@student.dk")
                .phone("50456789")
                .studentStatus(StudentStatus.ACTIVE)
                .dateOfBirth(LocalDate.of(2002, 11, 5))
                .dateOfEnrollment(LocalDate.of(2023, 9, 1))
                .build());

        students.add(Student.builder()
                .name("Olivia Christensen")
                .address("Frederiksborggade 23")
                .email("olivia@student.dk")
                .phone("60567890")
                .studentStatus(StudentStatus.ACTIVE)
                .dateOfBirth(LocalDate.of(2001, 4, 18))
                .dateOfEnrollment(LocalDate.of(2022, 9, 1))
                .build());

        students.add(Student.builder()
                .name("Lucas Pedersen")
                .address("Jagtvej 56")
                .email("lucas@student.dk")
                .phone("70678901")
                .studentStatus(StudentStatus.ACTIVE)
                .dateOfBirth(LocalDate.of(2002, 9, 30))
                .dateOfEnrollment(LocalDate.of(2023, 2, 1))
                .build());

        students.add(Student.builder()
                .name("Ella Larsen")
                .address("Tagensvej 89")
                .email("ella@student.dk")
                .phone("80789012")
                .studentStatus(StudentStatus.INACTIVE)
                .dateOfBirth(LocalDate.of(2003, 6, 12))
                .dateOfEnrollment(LocalDate.of(2024, 2, 1))
                .build());

        students.add(Student.builder()
                .name("Oscar Møller")
                .address("Lyngbyvej 67")
                .email("oscar@student.dk")
                .phone("90890123")
                .studentStatus(StudentStatus.ACTIVE)
                .dateOfBirth(LocalDate.of(2001, 12, 25))
                .dateOfEnrollment(LocalDate.of(2022, 9, 1))
                .build());

        students.add(Student.builder()
                .name("Freja Sørensen")
                .address("Roskildevej 101")
                .email("freja@student.dk")
                .phone("21901234")
                .studentStatus(StudentStatus.ACTIVE)
                .dateOfBirth(LocalDate.of(2002, 8, 14))
                .dateOfEnrollment(LocalDate.of(2023, 9, 1))
                .build());

        students.add(Student.builder()
                .name("Victor Rasmussen")
                .address("Valby Langgade 45")
                .email("victor@student.dk")
                .phone("31012345")
                .studentStatus(StudentStatus.ACTIVE)
                .dateOfBirth(LocalDate.of(2003, 2, 28))
                .dateOfEnrollment(LocalDate.of(2024, 9, 1))
                .build());

        students.add(Student.builder()
                .name("Isabella Thomsen")
                .address("Hvidovrevej 78")
                .email("isabella@student.dk")
                .phone("41123456")
                .studentStatus(StudentStatus.INACTIVE)
                .dateOfBirth(LocalDate.of(2002, 5, 7))
                .dateOfEnrollment(LocalDate.of(2023, 2, 1))
                .build());

        students.add(Student.builder()
                .name("Alfred Poulsen")
                .address("Strandvejen 234")
                .email("alfred@student.dk")
                .phone("51234567")
                .studentStatus(StudentStatus.ACTIVE)
                .dateOfBirth(LocalDate.of(2001, 10, 19))
                .dateOfEnrollment(LocalDate.of(2022, 9, 1))
                .build());

        students.add(Student.builder()
                .name("Clara Jørgensen")
                .address("Smallegade 56")
                .email("clara@student.dk")
                .phone("61345678")
                .studentStatus(StudentStatus.ACTIVE)
                .dateOfBirth(LocalDate.of(2003, 3, 21))
                .dateOfEnrollment(LocalDate.of(2024, 2, 1))
                .build());

        students.add(Student.builder()
                .name("Magnus Madsen")
                .address("Gl. Kongevej 123")
                .email("magnus@student.dk")
                .phone("71456789")
                .studentStatus(StudentStatus.ACTIVE)
                .dateOfBirth(LocalDate.of(2002, 7, 9))
                .dateOfEnrollment(LocalDate.of(2023, 9, 1))
                .build());

        students.add(Student.builder()
                .name("Alma Kristensen")
                .address("Frederikssundsvej 67")
                .email("alma@student.dk")
                .phone("81567890")
                .studentStatus(StudentStatus.ACTIVE)
                .dateOfBirth(LocalDate.of(2001, 11, 16))
                .dateOfEnrollment(LocalDate.of(2022, 9, 1))
                .build());

        return students;
    }

    public static List<Course> getCourses() {
        List<Course> courses = new ArrayList<>();

        courses.add(Course.builder()
                .name("Data Structures and Algorithms")
                .classroom("3.4")
                .teacher("Jon Bertelsen")
                .semester("3. semester")
                .timeOfCoruse(LocalTime.of(9, 0))
                .build());

        courses.add(Course.builder()
                .name("Database Systems")
                .classroom("2.7")
                .teacher("Jörg Wichmann")
                .semester("3. semester")
                .timeOfCoruse(LocalTime.of(12, 30))
                .build());

        courses.add(Course.builder()
                .name("Web Development")
                .classroom("4.2")
                .teacher("Thomas Hartmann")
                .semester("2. semester")
                .timeOfCoruse(LocalTime.of(8, 30))
                .build());

        courses.add(Course.builder()
                .name("Software Engineering")
                .classroom("1.5")
                .teacher("Tobias Zimmermann")
                .semester("4. semester")
                .timeOfCoruse(LocalTime.of(14, 0))
                .build());

        courses.add(Course.builder()
                .name("Operating Systems")
                .classroom("3.9")
                .teacher("Per Kringelbach")
                .semester("5. semester")
                .timeOfCoruse(LocalTime.of(10, 15))
                .build());

        return courses;
    }
}