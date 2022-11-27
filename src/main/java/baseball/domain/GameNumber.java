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

    public int getStrikeNumbers(UserNumber userNumber) {
        int strike = 0;
        List<Integer> userNumbers = userNumber.getUserNumbers();
        for (int position = 0; position < userNumbers.size(); position++) {
            if (isStrike(position, userNumbers.get(position))) {
                strike++;
            }
        }
        return strike;
    }

    private boolean isBall(int number) {
        return gameNumbers.contains(number);
    }

    private boolean isStrike(int position, int userNumber) {
        return this.gameNumbers.get(position) == userNumber;
    }
}
