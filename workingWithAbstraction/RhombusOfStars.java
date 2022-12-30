package workingWithAbstraction;

import java.util.Scanner;

public class RhombusOfStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        printFirstPartOfRhombus(number);
        printSecondPartOfRhombus(number);
    }

    private static void printFirstPartOfRhombus(int number) {
        int spaces = number - 1;

        for (int i = 1; i <= number; i++) {
            printAllSpacesPerRow(spaces);
            spaces--;
            printAllStarsPerRow(i);
            System.out.println();
        }
    }

    private static void printAllSpacesPerRow(int spaces) {
        for (int i = 0; i < spaces; i++) {
            System.out.print(" ");
        }
    }

    private static void printAllStarsPerRow(int stars) {
        for (int i = 0; i < stars; i++) {
            System.out.print("* ");
        }
    }

    private static void printSecondPartOfRhombus(int number) {
        int spaces = 1;

        for (int i = number - 1; i >= 1; i--) {
            printAllSpacesPerRow(spaces);
            spaces++;
            printAllStarsPerRow(i);
            System.out.println();
        }
    }
}
