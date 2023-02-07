package space.harbour;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SpellChecker {
    private Dictionary dictionary;

    @Autowired
    public SpellChecker(Dictionary dictionary) {
        this.dictionary = dictionary;
    }

    public void checkSpelling() {
        dictionary.checkSpelling();
    }
}
