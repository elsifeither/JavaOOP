package WorkingWithAbstraction.HotelReservation04;

public enum DiscountType {
    VIP(0.80),
    SECOND_VISIT(0.90),
    NONE(1.0);
    private double discount;

    DiscountType(double discount) {
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }

    public static DiscountType fromString(String str) {
        switch (str) {
            case "VIP":
                return VIP;
            case "SecondVisit":
                return SECOND_VISIT;
            case "None":
                return NONE;
            default:
                throw new IllegalArgumentException("unknown");
        }
    }

}
