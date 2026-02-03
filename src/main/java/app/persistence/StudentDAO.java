package app.persistence;

import app.entities.Student;

public interface StudentDAO {
    Student create(Student student);

    Student update(Student student);

    boolean delete(Integer id);
}
