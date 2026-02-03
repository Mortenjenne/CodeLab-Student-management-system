package app.persistence;

import app.entities.Course;

import java.util.List;

public interface CourseDAO {
    Course create(Course course);

    Course update(Course course);

    boolean delete(Integer id);

    List<Course> findAll();
}
