package workingWithAbstractionExercise.greedyTimes;

import java.util.HashMap;
import java.util.Map;

public class Bag {

    private long capacity;
    private HashMap<ItemTypes, HashMap<String, Long>> totalWealth;

    public Bag(long capacity) {
        this.capacity = capacity;
    }

    public long getCapacity() {
        return this.capacity;
    }

    public HashMap<ItemTypes, HashMap<String, Long>> getTotalWealth() {
        return this.totalWealth;
    }


    public void toString(HashMap<ItemTypes, HashMap<String, Long>> map) {
        for (Map.Entry<ItemTypes, HashMap<String, Long>> mapEntry : getTotalWealth().entrySet()) {
            Long sumAmounts = mapEntry.getValue().values().stream().mapToLong(e -> e).sum();

            System.out.printf("<%s> $%s%n", mapEntry.getKey(), sumAmounts);
            mapEntry.getValue().entrySet().stream().sorted((e1, e2) -> e2.getKey().compareTo(e1.getKey()))
                            .forEach(e -> System.out.printf("##%s - %d%n", e.getKey(), e.getValue()));

        }

    }

    public boolean isTheRightItem (Item item) {
        ItemTypes type = item.getType();
        boolean goesInTheBag = true;

        if (item.getName().length() == 3) {
            type = ItemTypes.CASH;
        } else if (item.getName().toLowerCase().endsWith("gem")) {
            type = ItemTypes.GEM;
        } else if (item.getName().toLowerCase().equals("gold")) {
            type = ItemTypes.GOLD;
        } else {
            goesInTheBag = false;
        }

        return goesInTheBag;
    }

    public boolean isTherePlaceForTheItemInBag(boolean isItRight, Item item) {
        boolean isThereAnyPlace = true;

        HashMap<ItemTypes, HashMap<String, Long>> map = getTotalWealth();
        map = new HashMap<>();
        map.put(ItemTypes.GOLD, new HashMap<>());
        map.put(ItemTypes.GEM, new HashMap<>());
        map.put(ItemTypes.CASH, new HashMap<>());

        long amountInBag = getTotalWealth().get(item.getType()).values().stream().mapToLong(e -> e).sum() + item.getAmount();

        if (getCapacity() < amountInBag || !isItRight) {
            isThereAnyPlace = false;
        }

        return isThereAnyPlace;
    }

    public boolean isTheAmountRight (boolean isTherePlace, Item item) {
        boolean readyToBeInTheBag = false;

        switch (item.getType()) {
            case GEM:
                if (getTotalWealth().get(ItemTypes.GEM).values().stream().mapToLong(e -> e).sum() + item.getAmount()
                        < getTotalWealth().get(ItemTypes.GOLD).values().stream().mapToLong(e -> e).sum() &&
                isTherePlace) {
                    readyToBeInTheBag = true;
                }
                break;
            case CASH:
                if (getTotalWealth().get(ItemTypes.CASH).values().stream().mapToLong(e -> e).sum() + item.getAmount()
                        < getTotalWealth().get(ItemTypes.GEM).values().stream().mapToLong(e -> e).sum() &&
                isTherePlace) {
                    readyToBeInTheBag = true;
                }
                break;
        }

        return readyToBeInTheBag;
    }

    public void putTheItemInTheBag(Item item) {
        if (!getTotalWealth().get(item.getType()).containsKey(item.getName())) {
            getTotalWealth().get(item.getType()).put(item.getName(), 0L);
        }

        long currentAmount = getTotalWealth().get(item.getType()).get(item.getName());
        getTotalWealth().get(item.getType()).put(item.getName(), currentAmount + item.getAmount());
    }
}
