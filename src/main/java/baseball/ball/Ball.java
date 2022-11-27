package baseball.ball;

public class Ball {
    private final Number number;
    private final Index index;

    public Ball(Number number, Index index) {
        this.number = number;
        this.index = index;
    }

    public Number getNumber() {
        return number;
    }

    public Index getIndex() {
        return index;
    }

    public Result compareWithOtherBall(Ball otherBall) {
        if (number.isSameWithOtherNumber(otherBall.getNumber()) && index.isSameWithOtherIndex(otherBall.getIndex())) {
            return Result.STRIKE;
        }
        if (number.isSameWithOtherNumber(otherBall.getNumber())) {
            return Result.BALL;
        }
        return Result.NOTHING;
    }
}
