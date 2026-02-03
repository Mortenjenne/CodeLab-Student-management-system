package app.persistence;

import app.entities.Course;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

public class CourseDAOImpl implements CourseDAO {
    EntityManagerFactory emf;

    public CourseDAOImpl(EntityManagerFactory emf)
    {
        this.emf = emf;
    }

    @Override
    public Course create(Course course)
    {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(course);
        em.getTransaction().commit();
        em.close();
        return course;
    }
}
