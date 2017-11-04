package pl.silesiandevs.pizzaservice.controllers;

import javafx.beans.binding.Bindings;
import javafx.beans.binding.BooleanBinding;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ResourceBundle;

public class LoginController implements Initializable {

    @FXML
    private Button loginBtn;

    @FXML
    private TextField usernameTxt;

    @FXML
    private PasswordField passwordTxt;

    public void doLogin(ActionEvent actionEvent) throws IOException, URISyntaxException {

        System.out.println("login btn clicked");
        System.out.println("Trying to login with: " + usernameTxt.getText());
        System.out.println("Trying to login with: " + passwordTxt.getText());

        URL resource = getClass().getResource("/clientDetailsView.fxml");

        Parent clientDetailView = FXMLLoader.load(resource);
        Scene clientDetailScene = new Scene(clientDetailView);

        // get primary stage
        Stage primaryStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        // set next scene
        primaryStage.setScene(clientDetailScene);
        // switch scene
        primaryStage.show();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        BooleanBinding isUsernameFilled = Bindings.createBooleanBinding(() -> !usernameTxt.getText().isEmpty(), usernameTxt.textProperty());
        BooleanBinding isPasswordFilled = Bindings.createBooleanBinding(() -> !passwordTxt.getText().isEmpty(), passwordTxt.textProperty());
        // if username and password is filled, enable login btn
        loginBtn.disableProperty().bind(isUsernameFilled.not().or(isPasswordFilled.not()));
    }
}
