package baseball.domain;

import static baseball.util.Constants.BASEBALL_NUMBER_SIZE;

public class Result {
    private final int strike;
    private final int ball;
    private final boolean isWin;

    public Result(Answer answer, Guess guess) {
        this.strike = countStrike(answer, guess);
        this.ball = countBall(answer, guess);
        this.isWin = strike == BASEBALL_NUMBER_SIZE;
    }

    private int countStrike(Answer answer, Guess guess) {
        return (int) guess.stream()
                .filter(answer::contains)
                .filter(number -> answer.indexOf(number) == guess.indexOf(number)).count();
    }

    private int countBall(Answer answer, Guess guess) {
        return (int) guess.stream()
                .filter(answer::contains)
                .filter(number -> answer.indexOf(number) != guess.indexOf(number)).count();
    }

    public int getBall() {
        return ball;
    }

    public int getStrike() {
        return strike;
    }

    public boolean isWin() {
        return isWin;
    }
}
