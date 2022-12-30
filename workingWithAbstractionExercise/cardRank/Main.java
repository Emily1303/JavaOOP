package workingWithAbstractionExercise.cardRank;

public class Main {

    public static void main(String[] args) {

        CardRanks[] cardRanks = CardRanks.values();

        System.out.println("Card Ranks: ");
        for (CardRanks card : cardRanks) {
            System.out.printf("Ordinal value: %d; Name value: %s%n",
                    card.ordinal(), card.name());
        }

    }
}