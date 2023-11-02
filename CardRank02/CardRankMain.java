package ExercisesWorkingWithAbstraction.CardRank02;

public class CardRankMain {
    public static void main(String[] args) {
        //Card Ranks:
        //Ordinal value: 0; Name value: ACE

        ThirteenRanks[] cardSuits = ThirteenRanks.values();
        System.out.println("Card Ranks:");
        for (ThirteenRanks card:cardSuits) {
            System.out.printf("Ordinal value: %d; Name value: %s%n",card.ordinal(),card.name());
        }




    }
}