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

    public boolean isFinish() {
        if (strike==SUCCESS_COUNT) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        if (strike==0 && ball==0) {
            return NOTHING_MESSAGE;
        }
        if (ball == 0) {
            return strike+STRIKE_MESSAGE;
        }
        if (strike==0) {
            return ball+BALL_MESSAGE;
        }
        return ball+BALL_MESSAGE + " " +strike+STRIKE_MESSAGE;
    }
}