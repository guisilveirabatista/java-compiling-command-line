package nl.guisilver;

import nl.guisilver.db.DbConnection;
import nl.guisilver.repository.PersonRepository;
import nl.guisilver.service.PersonService;
// import nl.guisilver.service.SayHello;
import java.sql.Connection;
import java.sql.SQLException;

import org.kohsuke.randname.RandomNameGenerator;

public class Main {

    public static void main(String[] args) {
        // SayHello sayHello = new SayHello();
        // String helloMessage = sayHello.sayHello();
        // System.out.println(helloMessage);
        RandomNameGenerator rnd = new RandomNameGenerator(0);
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