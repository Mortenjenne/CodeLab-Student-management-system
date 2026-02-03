package app.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalTime;

@Entity
@Table(name = "course")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder
@ToString
@EqualsAndHashCode
public class Course
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Setter
    @Column(name = "course_name", nullable = false)
    private String name;

    @Setter
    @Column(name = "teacher", nullable = false)
    private String teacher;

    @Setter
    @Column(name = "semester", nullable = false)
    private String semester;

    @Setter
    @Column(name = "classroom", nullable = false)
    private String classroom;

    @Setter
    @Column(name = "course_time", nullable = false)
    private LocalTime timeOfCoruse;
}
