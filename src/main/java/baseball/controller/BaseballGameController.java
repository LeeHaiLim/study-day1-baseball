package baseball.controller;

import baseball.domain.BaseballGame;
import baseball.domain.GameCommand;
import baseball.domain.GameNumber;
import baseball.ui.InputView;
import baseball.ui.OutputView;
import baseball.util.NumberGenerator;

public class BaseballGameController {

    public void run() {
        GameCommand gameCommand;
        BaseballGame baseballGame = new BaseballGame();
        do {
            GameNumber gameNumber = new GameNumber(NumberGenerator.getGameNumbers());
            OutputView.printGameStartMessage();
            doBaseBallGame(gameNumber, baseballGame);
            gameCommand = getGameCommand();
        } while (gameCommand.equals(GameCommand.RETRY));
    }

    private void doBaseBallGame(GameNumber gameNumber, BaseballGame baseballGame) {
        boolean isSucceed = false;
        while (!isSucceed) {
            OutputView.askNumber();
            isSucceed = baseballGame.doBaseballGame(gameNumber, InputView.readUserNumber());
        }
    }

    private GameCommand getGameCommand() {
        OutputView.printWinningMessage();
        return InputView.readReGameInput();
    }
}
