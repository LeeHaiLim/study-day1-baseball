package baseball.domain;

import baseball.ui.OutputView;

import java.util.List;

public class BaseballGame {

    private final int SUCCESS_STRIKE_COUNT = 3;

    public boolean doBaseballGame(GameNumber gameNumber, List<Integer> userNumbers) {
        UserNumber userNumber = new UserNumber(userNumbers);
        int strikes = gameNumber.getStrikeNumbers(userNumber);
        int balls = gameNumber.getBallNumbers(userNumber, strikes);
        printResult(strikes, balls);
        return strikes == SUCCESS_STRIKE_COUNT;
    }

    private void printResult(int strikes, int balls) {
        if (strikes == 0) {
            OutputView.printNothing();
            return;
        }
        OutputView.printResult(strikes, balls);
    }
}
