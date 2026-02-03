package app.persistence;

import app.entities.Course;

public interface CourseDAO {
    Course create(Course course);

    Course update(Course course);
}
