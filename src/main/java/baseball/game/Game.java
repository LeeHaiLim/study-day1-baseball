package baseball.game;

import baseball.ball.Balls;
import baseball.ball.BaseBallStatus;
import util.Input;
import util.Output;
import util.RandomUniqueNumber;

import java.util.List;

public class Game {
    public static final String PLAY_COMMAND = "1";
    private final Input input;
    private final Output output;

    private GameStatus gameStatus;
    private BaseBallStatus baseBallStatus;

    public Game(Input input, Output output) {
        this.input = input;
        this.output = output;
        this.gameStatus = GameStatus.PLAYING;
    }

    public void run() {
        while (gameStatus.isPlaying()) {
            baseBallStatus = BaseBallStatus.GUESSING;
            List<Integer> randomUniqueNumbers = RandomUniqueNumber.getRandomUniqueNumbers(3);
            String commandAfterGame = playBaseBallGame(randomUniqueNumbers);
            gameStatus = determineGameStatusAfterGame(commandAfterGame);
        }
    }

    private GameStatus determineGameStatusAfterGame(String commandAfterGame) {
        if (commandAfterGame.equals(PLAY_COMMAND)) {
            return GameStatus.PLAYING;
        }
        return GameStatus.EXIT;
    }

    public String playBaseBallGame(List<Integer> numbers) {
        Balls answerBalls = new Balls(numbers);
        output.printStartGame();

        while (baseBallStatus.isGuessing()) {
            output.printWaitUserInput();
            List<Integer> userNumbers = input.getUserNumbers();

            Balls userBalls = new Balls(userNumbers);

            GameResult gameResult = answerBalls.compareAllBalls(userBalls);
            output.printUserScore(gameResult);
            baseBallStatus = gameResult.isWinCondition();
        }

        output.printGameWin();
        return input.getCommandAfterGameWin();
    }
}
