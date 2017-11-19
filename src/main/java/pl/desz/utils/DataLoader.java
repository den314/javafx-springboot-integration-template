package pl.desz.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.desz.model.Person;
import pl.desz.repositories.PersonRepository;

import javax.annotation.PostConstruct;

/**
 * Util class for loading data to DB
 * on application start up
 */
@Component
public class DataLoader {

    @Autowired
    private PersonRepository personRepository;

    @PostConstruct
    private void initDb() {
        // create 3 new person entities
        Person p1 = new Person();
        p1.setName("First Person");

        Person p2 = new Person();
        p2.setName("Second Person");

        Person p3 = new Person();
        p3.setName("Third person");
        // persist them to DB
        personRepository.save(p1);
        personRepository.save(p2);
        personRepository.save(p3);
    }


}
