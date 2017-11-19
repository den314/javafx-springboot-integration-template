package pl.desz;

import de.felixroske.jfxsupport.AbstractJavaFxApplicationSupport;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pl.desz.fxdomain.login.LoginView;

@SpringBootApplication
public class SampleApplication extends AbstractJavaFxApplicationSupport {

    public static void main(String[] args) {
       launchApp(SampleApplication.class, LoginView.class, args);
    }
}