package app.persistence;

import app.entities.Course;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.TypedQuery;

import java.util.List;

public class CourseDAOImpl implements CourseDAO {
    EntityManagerFactory emf;

    public CourseDAOImpl(EntityManagerFactory emf) {
        this.emf = emf;
    }

    @Override
    public Course create(Course course) {
        try(EntityManager em = emf.createEntityManager()) {
            em.getTransaction().begin();
            em.persist(course);
            em.getTransaction().commit();
            return course;
        }
    }

    @Override
    public Course update(Course course) {
        try(EntityManager em = emf.createEntityManager()) {
            em.getTransaction().begin();
            Course mergedCourse = em.merge(course);
            em.getTransaction().commit();
            return mergedCourse;
        }
    }

    @Override
    public boolean delete(Integer id) {
        try(EntityManager em = emf.createEntityManager()) {
            em.getTransaction().begin();
            Course course = em.find(Course.class, id);
            if (course != null) {
                em.remove(course);
                em.getTransaction().commit();
                return true;
            }
            em.getTransaction().rollback();
            return false;
        }
    }

    @Override
    public List<Course> findAll() {
        try(EntityManager em = emf.createEntityManager()){
            TypedQuery<Course> query = em.createQuery("select c from Course c",Course.class);
            return query.getResultList();
        }
    }
}
