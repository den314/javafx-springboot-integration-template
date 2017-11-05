package pl.silesiandevs.fxdomain.client;

import de.felixroske.jfxsupport.FXMLController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import org.springframework.beans.factory.annotation.Autowired;
import pl.silesiandevs.model.Customer;
import pl.silesiandevs.repositories.CustomerRepository;

import javax.xml.soap.Text;
import java.util.List;

@FXMLController
public class ClientController{

    @FXML
    private TextField phoneNumber;

    @FXML
    private TextField streetName;

    @FXML
    private TextField houseNumber;

    @FXML
    private TextField flatNumber;

    @FXML
    private TextField cityName;

    @FXML
    private TextArea comment; // ??? not sure if its a good name for this var // Pole: UWAGI

    @FXML
    private ComboBox payment;

    @FXML
    private Button saveBtn;

    @FXML
    private Button cancelBtn;

    @Autowired
    private CustomerRepository customerRepository;

        public void doContinue(ActionEvent actionEvent){
        System.out.println("Dalej button clicked.");
    }

    public void doCancel(ActionEvent actionEvent){
        System.out.println("Anuluj button clicked.");
    }

    public void saveCustomer(ActionEvent actionEvent) {
        Customer c = new Customer();
        c.setPhoneNumber(phoneNumber.getText());
        c.setStreetName(streetName.getText());
        c.setHouseNumber(houseNumber.getText());
        c.setFlatNumber(flatNumber.getText());
        c.setCityName(cityName.getText());
        c.setComment(comment.getText());
        c.setPayment(payment.getValue().toString());
        System.out.println("creting customer " + c);

        customerRepository.save(c);
    }

    public void showCustomers() {
        for (Customer customer : customerRepository.findAll()) {
            System.out.println(customer);
        }
    }
}
