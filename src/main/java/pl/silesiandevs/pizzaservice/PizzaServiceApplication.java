package pl.silesiandevs.pizzaservice;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class PizzaServiceApplication extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("/loginView.fxml"));
        primaryStage.setTitle("Login to Pizza Service");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.resizableProperty().setValue(false);
        primaryStage.show();
    }
}
