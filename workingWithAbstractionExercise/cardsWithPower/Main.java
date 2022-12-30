package workingWithAbstractionExercise.cardsWithPower;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String rank = scanner.nextLine();
        String suit = scanner.nextLine();

        int powerRank = Ranks.valueOf(rank.toUpperCase()).getPower();
        int powerSuit = Suits.valueOf(suit.toUpperCase()).getPower();

        int totalPower = powerRank + powerSuit;

        System.out.printf("Card name: %s of %s; Card power: %d",
                rank.toUpperCase(), suit.toUpperCase(), totalPower);
    }
}
