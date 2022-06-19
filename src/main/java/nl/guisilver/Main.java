package nl.guisilver;

import nl.guisilver.service.SayHello;
import org.kohsuke.randname.RandomNameGenerator;

public class Main {

    public static void main(String[] args) {
        SayHello sayHello = new SayHello();
        String helloMessage = sayHello.sayHello();
        System.out.println(helloMessage);

        RandomNameGenerator rnd = new RandomNameGenerator(0);
        System.out.println(rnd.next());
    }
}