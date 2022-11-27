package baseball.model;

public class Pitcher {
    PitcherNumber pitcherNumber;

    public Pitcher(String input) {
        this.pitcherNumber = new PitcherNumber(input);
    }

    public PitcherNumber getPitcherNumber() {
        return pitcherNumber;
    }
}
