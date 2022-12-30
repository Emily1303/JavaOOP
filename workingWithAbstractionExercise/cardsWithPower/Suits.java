package workingWithAbstractionExercise.cardsWithPower;

public enum Suits {

    CLUBS("CLUBS", 0),
    DIAMONDS("DIAMONDS", 13),
    HEARTS("HEARTS", 26),
    SPADES("SPADES", 39);

    private String name;
    private int power;

    Suits(String name, int power) {
        this.name = name;
        this.power = power;
    }

    public int getPower() {
        return this.power;
    }
}
