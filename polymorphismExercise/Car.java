package polymorphismExercise;

public class Car extends Vehicle {

    private static final double AIR_CONDITIONER = 0.9;

    public Car(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption + AIR_CONDITIONER);
    }


}
