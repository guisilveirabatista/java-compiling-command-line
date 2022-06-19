package nl.guisilver;

import nl.guisilver.db.DbConnection;
import nl.guisilver.repository.PersonRepository;
import nl.guisilver.service.PersonService;
import java.sql.Connection;
import java.sql.SQLException;

import org.kohsuke.randname.RandomNameGenerator;

public class Main {

    public static void main(String[] args) {
        RandomNameGenerator rnd = new RandomNameGenerator();
        String person = rnd.next();

        try {
            Connection conn = DbConnection.getConnection();
            PersonRepository personRepository = new PersonRepository(conn);
            PersonService personService = new PersonService(personRepository);

            Integer id = personService.save(person);
            String result = personService.getPerson(id);

            System.out.println(result);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}