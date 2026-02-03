package app.persistence;

import app.entities.Student;

import java.util.List;

public interface StudentDAO {
    Student create(Student student);

    Student update(Student student);

    boolean delete(Integer id);

    List<Student> findAll();
}
