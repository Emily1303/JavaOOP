package workingWithAbstractionExercise.greedyTimes;

public class Item {

    private String name;
    private ItemTypes type;
    private long amount;

    public Item (String name, long amount) {
        this.name = name;
        this.amount = amount;
    }

    public String getName() {
        return this.name;
    }

    public ItemTypes getType() {
        return this.type;
    }

    public long getAmount() {
        return this.amount;
    }
}
