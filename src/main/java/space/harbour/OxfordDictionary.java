package space.harbour;

import org.springframework.stereotype.Component;

@Component
public class OxfordDictionary implements Dictionary {

    @Override
    public void checkSpelling() {
        System.out.println("Oxford Dictionary was used.");
    }
}
