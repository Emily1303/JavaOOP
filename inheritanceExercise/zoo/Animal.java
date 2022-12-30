package inheritanceExercise.zoo;

public class Animal {

    protected String name;

    protected Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
