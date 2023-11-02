package ExercisesWorkingWithAbstraction.CardsWithPower03;

import java.util.Scanner;

public class CardsWithPowerMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String cardName = sc.nextLine();
        String suitName = sc.nextLine();

        Card card = new Card(SuitPowers.valueOf(suitName), RankPowers.valueOf(cardName));
        System.out.printf("Card name: %s of %s; Card power: %d",cardName,suitName,card.calculatePower());




    }
}