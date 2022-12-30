package polymorphism.animals;

public class Cat extends Animal {

    public Cat(String name, String favouriteFood) {
        super(name, favouriteFood);
    }

    @Override
    protected String explainSelf() {
        StringBuilder output = new StringBuilder();
        output.append(super.explainSelf()).append(System.lineSeparator())
                .append("MEEOW");

        return output.toString();
    }
}
