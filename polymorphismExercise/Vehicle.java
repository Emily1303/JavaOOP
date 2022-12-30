package polymorphismExercise;

import java.text.DecimalFormat;

public abstract class Vehicle {

    private double fuelQuantity;
    private double fuelConsumption;

    public Vehicle(double fuelQuantity, double fuelConsumption) {
        this.fuelQuantity = fuelQuantity;
        this.fuelConsumption = fuelConsumption;
    }

    protected void drive(double distance) {
        double totalFuelForDistance = distance * fuelConsumption;
        if (totalFuelForDistance > fuelQuantity) {
            throw new IllegalStateException(getClass().getSimpleName() + " needs refueling");
        } else {
            fuelQuantity = fuelQuantity - totalFuelForDistance;

            DecimalFormat decimalFormat = new DecimalFormat("##.##");
            System.out.printf("%s travelled %s km%n",
                    getClass().getSimpleName(), decimalFormat.format(distance));
        }

    }

    protected void refuel(double liters) {
        fuelQuantity = fuelQuantity + liters;
    }

    public double getFuelQuantity() {
        return fuelQuantity;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        output.append(String.format("%s: %.2f", getClass().getSimpleName(), fuelQuantity));

        return output.toString();
    }
}
