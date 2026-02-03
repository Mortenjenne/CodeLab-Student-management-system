package app.persistence;

import app.entities.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

public class StudentDAOImpl implements StudentDAO {
    private EntityManagerFactory emf;

    public StudentDAOImpl(EntityManagerFactory emf)
    {
        this.emf = emf;
    }

    @Override
    public Student create(Student student)
    {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(student);
        em.getTransaction().commit();
        em.close();
        return student;
    }
}
