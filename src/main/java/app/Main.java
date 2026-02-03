package app;

import app.config.HibernateConfig;
import app.entities.Person;
import app.persistence.PersonDAO;
import app.persistence.PersonDAOImpl;
import jakarta.persistence.EntityManagerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Main
{
    public static void main(String[] args)
    {
        Logger LOGGER = LoggerFactory.getLogger(Main.class);
        EntityManagerFactory emf = HibernateConfig.getEntityManagerFactory();
        PersonDAO personDAO = new PersonDAOImpl(emf);
        Person person = Person.builder()
                .name("Morten")
                .age(36)
                .build();

        Person fromDB = personDAO.createPerson(person);
        LOGGER.info("Testing person from db: {}", fromDB);
    }
}