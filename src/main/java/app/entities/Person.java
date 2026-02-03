package app.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "person")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@EqualsAndHashCode
@ToString
public class Person
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Setter
    @Column(name = "person_name", nullable = false)
    private String name;

    @Setter
    @Column(name = "age", nullable = false)
    private int age;
}
