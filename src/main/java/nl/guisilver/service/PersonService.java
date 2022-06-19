package nl.guisilver.service;

import java.sql.SQLException;
import nl.guisilver.repository.PersonRepository;

public class PersonService {

    private PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public Integer save(String person) throws SQLException {
        try {
            return this.personRepository.save(person);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String getPerson(int id) {
        try {
            return this.personRepository.getPerson(id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

}
