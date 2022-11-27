package baseball.ball;

import baseball.game.GameResult;

import java.util.ArrayList;
import java.util.List;

public class Balls {
    public static final int INIT = 0;
    public static final int BALLS_SIZE = 3;
    private final List<Ball> balls = new ArrayList<>();

    public Balls(List<Integer> numbers) {
        for (int i = INIT; i < BALLS_SIZE; i++) {
            Number number = new Number(numbers.get(i));
            Index index = new Index(i);
            Ball ball = new Ball(number, index);
            balls.add(ball);
        }
    }

    public GameResult compareAllBalls(Balls otherBalls) {
        List<Ball> answers = otherBalls.balls;
        GameResult gameResult = new GameResult();

        for (Ball ball : balls) {
            Result result = answers.stream()
                    .map(answer -> answer.compareWithOtherBall(ball))
                    .filter(Result::isNotNothing)
                    .findFirst()
                    .orElse(Result.NOTHING);
            gameResult.plusScore(result);
        }

        return gameResult;
    }
}
