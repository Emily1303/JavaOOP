package inheritance;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class RandomArrayList extends ArrayList<Object> {

    public Object getRandomElement() {
        int randomNumber = ThreadLocalRandom.current().nextInt(0, size());
        return get(randomNumber);
    }
}
