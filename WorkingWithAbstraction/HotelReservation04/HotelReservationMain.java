package WorkingWithAbstraction.HotelReservation04;

import java.util.Scanner;

public class HotelReservationMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String []tokens = sc.nextLine().split("\\s+");
        double pricePerDay = Double.parseDouble(tokens[0]);
        int days = Integer.parseInt(tokens[1]);
        Season season = Season.valueOf(tokens[2].toUpperCase());
        DiscountType discountType = DiscountType.fromString(tokens[3]);

        PriceCalculator priceCalculator = new PriceCalculator(pricePerDay, days, season, discountType);
        System.out.printf("%.2f",priceCalculator.calculatePrice());




    }
}
