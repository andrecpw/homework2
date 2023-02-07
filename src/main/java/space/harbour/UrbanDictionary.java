package space.harbour;

import org.springframework.stereotype.Component;

@Component
public class UrbanDictionary implements Dictionary {

    @Override
    public void checkSpelling() {
        System.out.println("Urban Dictionary was used.");
    }
}
