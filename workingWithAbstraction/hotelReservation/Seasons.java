package workingWithAbstraction.hotelReservation;

public enum Seasons {

    AUTUMN(1),
    SPRING(2),
    WINTER(3),
    SUMMER(4);

    private int numberToMultiply;

    Seasons(int numberToMultiply) {
        this.numberToMultiply = numberToMultiply;
    }

    public int getNumberToMultiply() {
        return this.numberToMultiply;
    }
}
