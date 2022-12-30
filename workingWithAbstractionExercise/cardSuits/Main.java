package workingWithAbstractionExercise.cardSuits;

import java.util.Arrays;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {

        CardSuits[] cardsArray = CardSuits.values();

        System.out.println("Card Suits: ");
        Consumer<CardSuits> consumer = n -> System.out.printf("Ordinal value: %d; Name value: %s%n",
                n.ordinal(), n.name());

        Arrays.stream(cardsArray).forEach(consumer);

    }
}
