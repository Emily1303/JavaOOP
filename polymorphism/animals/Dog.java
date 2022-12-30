package polymorphism.animals;

public class Dog extends Animal {

    public Dog(String name, String favouriteFood) {
        super(name, favouriteFood);
    }

    @Override
    protected String explainSelf() {
        StringBuilder output = new StringBuilder();
        output.append(super.explainSelf()).append(System.lineSeparator())
                .append("DJAAF");

        return output.toString();
    }
}
