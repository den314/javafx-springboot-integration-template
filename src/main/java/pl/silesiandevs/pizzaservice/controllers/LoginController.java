package pl.silesiandevs.pizzaservice.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class LoginController {

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
}
