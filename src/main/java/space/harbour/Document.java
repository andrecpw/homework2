package space.harbour;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Document {
    private SpellChecker spellChecker;

    public Document(SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
        System.out.println("Document is created!");
    }

    public void checkSpelling() {
        spellChecker.checkSpelling();
    }
}
