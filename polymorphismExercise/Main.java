package polymorphismExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] commandCar = scanner.nextLine().split("\\s+");

        double fuelQuantityCar = Double.parseDouble(commandCar[1]);
        double fuelConsumptionCar = Double.parseDouble(commandCar[2]);
        Vehicle car = new Car(fuelQuantityCar, fuelConsumptionCar);

        String[] commandTruck = scanner.nextLine().split("\\s+");
        double fuelQuantityTruck = Double.parseDouble(commandTruck[1]);
        double fuelConsumptionTruck = Double.parseDouble(commandTruck[2]);
        Vehicle truck = new Truck(fuelQuantityTruck, fuelConsumptionTruck);

        Map<String, Vehicle> vehiclesMap = new LinkedHashMap<>();
        vehiclesMap.put(commandCar[0], car);
        vehiclesMap.put(commandTruck[0], truck);

        int numberOfCommands = Integer.parseInt(scanner.nextLine());

        while (numberOfCommands-- > 0) {
            String[] input = scanner.nextLine().split("\\s+");

            String method = input[0];
            String vehicleType = input[1];
            double argument = Double.parseDouble(input[2]);

            switch (method) {
                case "Drive":
                try {
                    vehiclesMap.get(vehicleType).drive(argument);
                } catch (IllegalStateException e) {
                    System.out.println(e.getMessage());
                }

                break;
                case "Refuel":
                    vehiclesMap.get(vehicleType).refuel(argument);
                    break;
            }
        }

        System.out.println(car);
        System.out.println(truck);
    }
}
