package WorkingWithAbstraction.HotelReservation04;

import WorkingWithAbstraction.HotelReservation04.DiscountType;

public class PriceCalculator {


    //price per day, number of days, the season, and a discount type.
    private double pricePerDay;
    private int numberOfDays;
    private Season season;
    private DiscountType discountType;

    public PriceCalculator(double pricePerDay, int numberOfDays, Season season, DiscountType discountType) {
        this.pricePerDay = pricePerDay;
        this.numberOfDays = numberOfDays;
        this.season = season;
        this.discountType = discountType;
    }
    public double calculatePrice() {
        return pricePerDay*numberOfDays*season.getPriceBySeason()*discountType.getDiscount();
    }



}
