package workingWithAbstractionExercise.greedyTimes;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long bagCapacity = Long.parseLong(scanner.nextLine());
        String[] safe = scanner.nextLine().split("\\s+");

        Bag bag = new Bag(bagCapacity);
        HashMap<ItemTypes, HashMap<String, Long>> map = bag.getTotalWealth();

        for (int i = 0; i < safe.length; i += 2) {
            String name = safe[i];
            long amountItem = Long.parseLong(safe[i + 1]);

            Item newItem = new Item(name, amountItem);
            boolean isItTheRightItem = bag.isTheRightItem(newItem);

            boolean isTheItemInTheBag = bag.isTherePlaceForTheItemInBag(isItTheRightItem, newItem);

            boolean isTheAmountOfItemsRight = bag.isTheAmountRight(isTheItemInTheBag, newItem);
            bag.putTheItemInTheBag(newItem);
        }

        bag.toString(map);
    }
}