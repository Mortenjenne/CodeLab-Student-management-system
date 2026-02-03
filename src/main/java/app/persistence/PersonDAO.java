package app.persistence;

import app.entities.Person;

import java.util.List;
import java.util.Optional;

public interface PersonDAO {
    Person createPerson(Person person);

    Optional<Person> findById(int id);

    List<Person> findAll();

    Person update(Person person);

    boolean deleteById(int id);
}
