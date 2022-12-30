package workingWithAbstraction.pointInRectangle;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        int bottomLeftX = input[0];
        int bottomLeftY = input[1];
        int topRightX = input[2];
        int topRightY = input[3];

        Point bottomLeft = new Point(bottomLeftX, bottomLeftY);
        Point topRight = new Point(topRightX, topRightY);

        Rectangle rectangle = new Rectangle(bottomLeft, topRight);

        int iterations = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= iterations; i++) {
            int[] pointCoordinates = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();

            int x = pointCoordinates[0];
            int y = pointCoordinates[1];

            Point point = new Point(x, y);

            System.out.println(rectangle.contains(point));
        }
    }
}
