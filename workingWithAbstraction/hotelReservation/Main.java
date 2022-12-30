package workingWithAbstraction.hotelReservation;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        double price = Double.parseDouble(input[0]);
        int days = Integer.parseInt(input[1]);
        String season = input[2].toUpperCase();
        String discount = input[3].toUpperCase();

        double totalPrice = PriceCalculator.getTheTotalPrice(price, days,
                Seasons.valueOf(season), DiscountType.valueOf(discount));

        System.out.printf("%.2f", totalPrice);
    }
}
