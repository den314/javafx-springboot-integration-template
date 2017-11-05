package pl.silesiandevs.fxdomain.client;

import de.felixroske.jfxsupport.FXMLController;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import org.springframework.beans.factory.annotation.Autowired;
import pl.silesiandevs.model.Customer;
import pl.silesiandevs.repositories.CustomerRepository;

@FXMLController
public class ClientController {

    @FXML
    private Label infoLbl;

    @FXML
    private Button repoBtn;

    @Autowired
    private CustomerRepository customerRepository;

    public void showMeTheMagic() {
        for (Customer c : customerRepository.findAll()) {
            System.out.println(c);
        }
    }
}
