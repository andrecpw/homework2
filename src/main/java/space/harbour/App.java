package space.harbour;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Configuration
@ComponentScan
public class App {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(App.class);

        var document = context.getBean(Document.class);

        document.checkSpelling();
    }
}