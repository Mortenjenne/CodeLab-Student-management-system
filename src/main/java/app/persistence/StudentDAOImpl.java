package app.persistence;

import app.entities.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.TypedQuery;

import java.util.List;

public class StudentDAOImpl implements StudentDAO {
    private EntityManagerFactory emf;

    public StudentDAOImpl(EntityManagerFactory emf) {
        this.emf = emf;
    }

    @Override
    public Student create(Student student) {
        try (EntityManager em = emf.createEntityManager()) {
            em.getTransaction().begin();
            em.persist(student);
            em.getTransaction().commit();
            return student;
        }
    }

    @Override
    public Student update(Student student) {
        try (EntityManager em = emf.createEntityManager()) {
            em.getTransaction().begin();
            Student mergedStudent = em.merge(student);
            em.getTransaction().commit();
            return mergedStudent;
        }
    }

    @Override
    public boolean delete(Integer id) {
        try (EntityManager em = emf.createEntityManager()) {
            em.getTransaction().begin();
            Student student = em.find(Student.class, id);
            if (student != null) {
                em.remove(student);
                em.getTransaction().commit();
                return true;
            }
            em.getTransaction().rollback();
            return false;
        }
    }

    @Override
    public List<Student> findAll() {
        try(EntityManager em = emf.createEntityManager()) {
            TypedQuery<Student> query = em.createQuery("select s from Student s",Student.class);
            return query.getResultList();
        }
    }
}
