package ExercisesWorkingWithAbstraction.CardSuit01;
public class CardSuitMain {
    public static void main(String[] args) {
        CardSuits[]cardSuits = CardSuits.values();

        System.out.println("Card Suits:");
        for (CardSuits cardSuit:cardSuits) {
            System.out.printf("Ordinal value: %d; Name value: %s%n",cardSuit.ordinal(),cardSuit.name());
        }
        //Card Suits:
        // Ordinal value: 0; Name value: CLUBS
    }
}


