package pl.silesiandevs.pizzaservice.controllers;

import javafx.beans.binding.Bindings;
import javafx.beans.binding.BooleanBinding;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {

    @FXML
    private Button loginBtn;

    @FXML
    private TextField usernameTxt;

    @FXML
    private TextField passwordTxt;

    public void doLogin(ActionEvent actionEvent) {

        if (actionEvent.getSource() == loginBtn) {
            System.out.println("login btn clicked");

            String username = usernameTxt.getText();

            if (username.isEmpty()) {
                System.out.println("username cannot be empty!");
                return;
            }

            System.out.println("Trying to login with: " + username);
        }


    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        BooleanBinding textField1Valid = Bindings.createBooleanBinding(() -> !usernameTxt.getText().isEmpty(), usernameTxt.textProperty());

        BooleanBinding textField2Valid = Bindings.createBooleanBinding(() -> !passwordTxt.getText().isEmpty(), passwordTxt.textProperty());

        loginBtn.disableProperty().bind(textField1Valid.not().or(textField2Valid.not()));
    }
}
