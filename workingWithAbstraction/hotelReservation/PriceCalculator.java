package workingWithAbstraction.hotelReservation;

public class PriceCalculator {

    public static double getTheTotalPrice(double pricePerDay, int days, Seasons season, DiscountType discountType) {
        double beginSum = pricePerDay * days;
        int numberToMultiply = season.getNumberToMultiply();
        double percent = discountType.getPercent();
        double totalSum = beginSum * numberToMultiply;
        return totalSum = totalSum - (totalSum * percent / 100);
    }
}
