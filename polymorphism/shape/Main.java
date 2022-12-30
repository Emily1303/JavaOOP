package polymorphism.shape;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double radius = Double.parseDouble(scanner.nextLine());

        Shape circle = new Circle(radius);
        System.out.println(circle.calculatePerimeter());
        System.out.println(circle.calculateArea());
    }
}
