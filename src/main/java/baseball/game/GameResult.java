package baseball.game;


import baseball.ball.Balls;
import baseball.ball.BaseBallStatus;
import baseball.ball.Result;

public class GameResult {
    public static final int NO_SCORE = 0;
    private int ballSize;
    private int strikeSize;

    public GameResult() {
        this.ballSize = 0;
        this.strikeSize = 0;
    }

    public int getBallSize() {
        return ballSize;
    }

    public int getStrikeSize() {
        return strikeSize;
    }

    public void plusScore(Result result) {
        if (result.isBall()) {
            ballSize++;
        }
        if (result.isStrike()) {
            strikeSize++;
        }
    }

    public boolean isNothing() {
        return ballSize == NO_SCORE && strikeSize == NO_SCORE;
    }

    public BaseBallStatus isWinCondition() {
        if (isGameWin()) {
            return BaseBallStatus.CORRECT;
        }
        return BaseBallStatus.GUESSING;
    }

    public boolean isGameWin() {
        return strikeSize == Balls.BALLS_SIZE;
    }
}
