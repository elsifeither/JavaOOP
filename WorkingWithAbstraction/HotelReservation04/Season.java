package WorkingWithAbstraction.HotelReservation04;

public enum Season {
    AUTUMN(1),
    SPRING(2),
    WINTER(3),
    SUMMER(4);

    private int priceBySeason;

    Season(int priceBySeason) {
        this.priceBySeason = priceBySeason;
    }

    public int getPriceBySeason() {
        return priceBySeason;
    }
}
