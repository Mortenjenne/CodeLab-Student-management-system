package app.persistence;

import app.entities.Person;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

import java.util.List;
import java.util.Optional;

public class PersonDAOImpl implements PersonDAO {
    private EntityManagerFactory emf;

    public PersonDAOImpl(EntityManagerFactory emf) {
        this.emf = emf;
    }

    @Override
    public Person createPerson(Person person)
    {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(person);
        em.getTransaction().commit();
        em.close();
        return person;
    }

    @Override
    public Optional<Person> findById(int id)
    {
        return null;
    }

    @Override
    public List<Person> findAll()
    {
        return List.of();
    }

    @Override
    public Person update(Person person)
    {
        return person;
    }

    @Override
    public boolean deleteById(int id)
    {
        return false;
    }
}
