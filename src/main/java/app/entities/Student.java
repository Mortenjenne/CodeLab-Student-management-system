package app.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name = "student")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder
@ToString
@EqualsAndHashCode
public class Student
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Setter
    @Column(name = "student_name",nullable = false)
    private String name;

    @Setter
    @Column(name = "phone_number",nullable = false)
    private String phone;

    @Setter
    @Column(name = "email",nullable = false)
    private String email;

    @Setter
    @Column(name = "adress",nullable = false)
    private String address;

    @Setter
    @Column(name = "student_status",nullable = false)
    private StudentStatus studentStatus;

    @Setter
    @Column(name = "date_of_birth",nullable = false)
    private LocalDate dateOfBirth;

    @Setter
    @Column(name = "date_of_enrollment",nullable = false)
    private LocalDate dateOfEnrollment;

    @Setter
    @Column(name = "course_id",nullable = false)
    private Set<Integer> courseId;
}
