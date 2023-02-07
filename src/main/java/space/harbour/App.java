package space.harbour;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class App {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(App.class);

        var document = context.getBean(Document.class);

        document.checkSpelling();
    }
}