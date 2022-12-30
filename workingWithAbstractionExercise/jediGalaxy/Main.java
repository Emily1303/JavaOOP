package workingWithAbstractionExercise.jediGalaxy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int rows = dimensions[0];
        int cols = dimensions[1];

        Galaxy galaxy = new Galaxy(rows, cols);
        int[][] newGalaxy = galaxy.getGalaxy();

        long collectedStars = 0;

        String command = scanner.nextLine();
        while (!command.equals("Let the Force be with you")) {
            int[] JediCoordinates = Arrays.stream(command.split(" ")).mapToInt(Integer::parseInt).toArray();
            int[] EvilPowerCoordinates = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            Jedi newJedi = new Jedi(JediCoordinates[0], JediCoordinates[1]);

            EvilPower newEvilPower = new EvilPower(EvilPowerCoordinates[0], EvilPowerCoordinates[1]);
            newEvilPower.evilPowerMoves(galaxy, newGalaxy);
            collectedStars += newJedi.jediMoves(galaxy, newGalaxy);

            command = scanner.nextLine();
        }

        System.out.println(collectedStars);
    }

}
