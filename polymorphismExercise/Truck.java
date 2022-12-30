package polymorphismExercise;

public class Truck extends Vehicle{

    private static final double AIR_CONDITIONER = 1.6;
    private static final double ADDED_PART_FUEL = 0.95;

    public Truck(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption + AIR_CONDITIONER);
    }

    @Override
    protected void refuel(double liters) {
        super.refuel(liters * ADDED_PART_FUEL);
    }
}
