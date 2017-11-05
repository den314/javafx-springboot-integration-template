package pl.silesiandevs.fxdomain.client;

import de.felixroske.jfxsupport.FXMLController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.springframework.beans.factory.annotation.Autowired;
import pl.silesiandevs.model.Customer;
import pl.silesiandevs.repositories.CustomerRepository;

@FXMLController
public class ClientController {

    @FXML
    private TextField phoneNumber;

    @FXML
    private TextField streetName;

    @FXML
    private Button saveBtn;

    @Autowired
    private CustomerRepository customerRepository;

    public void saveCustomer(ActionEvent actionEvent) {
        Customer c = new Customer();
        c.setPhoneNumber(phoneNumber.getText());
        c.setStreetName(streetName.getText());

        System.out.println("creting customer " + c);

        customerRepository.save(c);
    }

    public void showCustomers() {
        for (Customer customer : customerRepository.findAll()) {
            System.out.println(customer);
        }
    }
}
