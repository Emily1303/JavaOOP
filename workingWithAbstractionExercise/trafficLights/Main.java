package workingWithAbstractionExercise.trafficLights;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        int iterations = Integer.parseInt(scanner.nextLine());

        ArrayDeque<TrafficLight> trafficLightQueue = new ArrayDeque<>();

        for (String item : input) {
            TrafficLight trafficLight = new TrafficLight(Colour.valueOf(item));
            trafficLightQueue.offer(trafficLight);
        }

        while (iterations-- > 0) {
            for (int i = 0; i < trafficLightQueue.size(); i++) {
                TrafficLight trafficLight = trafficLightQueue.poll();
                trafficLight.changeCour();
                System.out.print(trafficLight.getColour() + " ");
                trafficLightQueue.offer(trafficLight);
            }

            System.out.println();
        }
    }
}
