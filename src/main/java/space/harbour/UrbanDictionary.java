package space.harbour;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UrbanDictionary implements Dictionary {

    @Autowired
    private SpellChecker spellChecker;

    @Override
    public void checkSpelling() {
        System.out.println("Urban Dictionary was used.");
    }
}
