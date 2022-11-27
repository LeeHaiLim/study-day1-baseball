package baseball.domain;

import baseball.constant.Result;

public class Counting {
    private final String NOTHING_MESSAGE = "낫싱";
    private final String STRIKE_MESSAGE = "스트라이크";
    private final String BALL_MESSAGE = "볼";

    private final int SUCCESS_COUNT = 3;
    private int strike;
    private int ball;

    public Counting() {
        this.strike = 0;
        this.ball = 0;
    }

    public void saveResult(Result result) {
        if (result==Result.STRIKE) {
            strike++;
            return;
        }
        if (result==Result.BALL) {
            ball++;
        }
    }
}