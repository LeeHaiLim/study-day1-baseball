package baseball.domain;

import java.util.List;

public class GameNumber {
    private final List<Integer> gameNumbers;

    public GameNumber() {
        this.gameNumbers = null;
    }

    public int getBallNumbers() {
        return 0;
    }

    public int getStrikeNumbers() {
        return 0;
    }

    private boolean isBall() {
        return true;
    }

    private boolean isStrike() {
        return true;
    }
}
