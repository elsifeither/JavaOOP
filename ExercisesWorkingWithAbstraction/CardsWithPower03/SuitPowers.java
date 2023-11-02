package ExercisesWorkingWithAbstraction.CardsWithPower03;

public enum SuitPowers {
    //: (CLUBS - 0, DIAMONDS - 13, HEARTS - 26, SPADES - 39).
    CLUBS(0),
    DIAMONDS(13),
    HEARTS(26),
    SPADES(39);
    private int value;

    SuitPowers(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
