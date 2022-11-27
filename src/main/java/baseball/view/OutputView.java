package baseball.view;

import static baseball.view.OutputMessage.GAME_START;
import static baseball.view.OutputMessage.GAME_END;
import static baseball.view.OutputMessage.BALL;
import static baseball.view.OutputMessage.STRIKE;
import static baseball.view.OutputMessage.NOTHING;

public class OutputView {
    private static final OutputView INSTANCE = new OutputView();

    private OutputView() {
    }

    public void printGameStart() {
        System.out.println(GAME_START.message());
    }

    public void printResult(int ball, int strike) {
        if (ball == 0 && strike == 0) {
            System.out.print(NOTHING.message());
        }
        if (ball > 0) {
            System.out.printf(BALL.message(), ball);
        }
        if (strike > 0) {
            System.out.printf(STRIKE.message(), strike);
        }
        System.out.println();
    }

    public void printGameEnd() {
        System.out.println(GAME_END.message());
    }

    public static OutputView getInstance() {
        return INSTANCE;
    }
}
