package space.harbour;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Document {

    public Document() {
        System.out.println("Document is created!");
    }
    @Autowired
    private SpellChecker spellChecker;

    @Autowired
    private ApplicationContext context;

    public void checkSpelling() {
        spellChecker.checkSpelling();
    }
}
