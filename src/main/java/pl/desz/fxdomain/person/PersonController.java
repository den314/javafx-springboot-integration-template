package pl.desz.fxdomain.person;

import de.felixroske.jfxsupport.FXMLController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import org.springframework.beans.factory.annotation.Autowired;
import pl.desz.model.Person;
import pl.desz.repositories.PersonRepository;

@FXMLController
public class PersonController {

    @FXML
    private Button checkBtn;


    @Autowired
    private PersonRepository personRepository;


    public void showAll() {
        personRepository.findAll().forEach(System.out::println);
    }
}
