package pl.silesiandevs.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.silesiandevs.model.Customer;
import pl.silesiandevs.repositories.CustomerRepository;

import javax.annotation.PostConstruct;

/**
 * Util class for loading data to DB
 * on application start up
 */
@Component
public class DataLoader {

    @Autowired
    private CustomerRepository customerRepository;

    @PostConstruct
    private void initDb() {
        // create 3 new customers
        Customer c1 = new Customer();
        c1.setPhoneNumber("Lipowa");
        c1.setPhoneNumber("512-883-223");

        Customer c2 = new Customer();
        c2.setPhoneNumber("Zielona");
        c2.setPhoneNumber("514-000-001");

        Customer c3 = new Customer();
        c3.setPhoneNumber("Daleka");
        c3.setPhoneNumber("511-555-002");
        // persist them to DB
        customerRepository.save(c1);
        customerRepository.save(c2);
        customerRepository.save(c3);
    }


}
