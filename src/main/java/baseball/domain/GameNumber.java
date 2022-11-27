package baseball.domain;

import java.util.List;

public class GameNumber {
    private final List<Integer> gameNumbers;

    public GameNumber(List<Integer> gameNumbers) {
        this.gameNumbers = gameNumbers;
    }

    public int getBallNumbers(UserNumber userNumber, int strike) {
        int containNumber = (int) userNumber.getUserNumbers().stream()
                .filter(this::isBall)
                .count();
        return containNumber - strike;
    }

    public int getStrikeNumbers() {
        return 0;
    }

    private boolean isBall(int number) {
        return gameNumbers.contains(number);
    }

    private boolean isStrike() {
        return true;
    }
}
