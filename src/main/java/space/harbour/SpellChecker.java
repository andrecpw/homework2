package space.harbour;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SpellChecker {
    @Autowired
    private Dictionary dictionary;

    public void checkSpelling() {
        dictionary.checkSpelling();
    }
}
