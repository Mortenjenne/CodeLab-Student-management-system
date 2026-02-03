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

    @Override
    public Student update(Student student)
    {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Student mergedStudent = em.merge(student);
        em.getTransaction().commit();
        em.close();
        return mergedStudent;
    }

    @Override
    public boolean delete(Integer id)
    {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Student student = em.find(Student.class, id);
        if(student != null)
        {
            em.remove(student);
            em.getTransaction().commit();
            return true;
        }
        em.getTransaction().rollback();
        return false;
    }
}
