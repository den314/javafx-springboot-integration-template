package pl.silesiandevs;

import de.felixroske.jfxsupport.AbstractJavaFxApplicationSupport;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pl.silesiandevs.fxdomain.login.LoginView;

@SpringBootApplication
public class PizzaServiceApplication extends AbstractJavaFxApplicationSupport {

    public static void main(String[] args) {
        launchApp(PizzaServiceApplication.class, LoginView.class, args);
    }
}