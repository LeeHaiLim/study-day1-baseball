package baseball;

import baseball.domain.Answer;
import baseball.domain.GameCommand;
import baseball.domain.Guess;
import baseball.domain.Result;
import baseball.view.InputView;
import baseball.view.OutputView;

public class BaseballController {
    InputView inputView = new InputView();
    OutputView outputView = new OutputView();

    public void run() {
        outputView.printGameStart();
        do {
            Answer answer = Answer.generateAnswer();
            playGame(answer);
            outputView.printGameEnd();
        } while (new GameCommand(inputView.readInputGameCommand()).isRestart());
    }

    public void playGame(Answer answer) {
        Guess guess;
        Result result;
        do {
            guess = new Guess(inputView.readInputNumber());
            result = new Result(answer, guess);
            outputView.printResult(result.getBall(), result.getStrike());
        } while (!result.isWin());
    }
}
