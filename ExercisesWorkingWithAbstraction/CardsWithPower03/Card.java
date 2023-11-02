package ExercisesWorkingWithAbstraction.CardsWithPower03;

public class Card {
    private SuitPowers suitPower;
    private RankPowers rankPower;

    public Card(SuitPowers suitPower, RankPowers rankPower) {
        this.suitPower = suitPower;
        this.rankPower = rankPower;
    }

    public int calculatePower() {
        return suitPower.getValue() + rankPower.getValue();
    }
}