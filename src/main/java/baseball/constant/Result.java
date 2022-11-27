package baseball.constant;

import java.util.List;

public enum Result {
    STRIKE, BALL, NONE;

    public static Result getResult(List<Integer> computerNumbers, int playerNumber, int index) {
        if (computerNumbers.get(index) == playerNumber) {
            return STRIKE;
        }
        if (computerNumbers.contains(playerNumber)) {
            return BALL;
        }
        return NONE;
    }
}