package pl.silesiandevs.fxdomain.login;

import de.felixroske.jfxsupport.FXMLController;
import javafx.beans.binding.Bindings;
import javafx.beans.binding.BooleanBinding;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import pl.silesiandevs.PizzaServiceApplication;
import pl.silesiandevs.fxdomain.client.ClientView;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ResourceBundle;

@FXMLController
public class LoginController implements Initializable {

    @FXML
    private Button loginBtn;

    @FXML
    private TextField usernameTxt;

    @FXML
    private PasswordField passwordTxt;

    // TODO: does not provide real login functionality yet
    public void doLogin(ActionEvent actionEvent) {

        System.out.println("login btn clicked");
        System.out.println("Trying to login with: " + usernameTxt.getText());
        System.out.println("Trying to login with: " + passwordTxt.getText());
        // show next scene to user
        PizzaServiceApplication.showView(ClientView.class);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        BooleanBinding isUsernameFilled = Bindings.createBooleanBinding(() -> !usernameTxt.getText().isEmpty(), usernameTxt.textProperty());
        BooleanBinding isPasswordFilled = Bindings.createBooleanBinding(() -> !passwordTxt.getText().isEmpty(), passwordTxt.textProperty());
        // if username and password is filled, enable login btn
        loginBtn.disableProperty().bind(isUsernameFilled.not().or(isPasswordFilled.not()));
    }
}
