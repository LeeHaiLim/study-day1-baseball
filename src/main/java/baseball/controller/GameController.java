package baseball.controller;

import baseball.domain.Command;
import baseball.domain.Computer;
import baseball.domain.Counting;
import baseball.domain.Player;
import baseball.view.InputView;
import baseball.view.OutputView;
import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class GameController {
    private final InputView inputView = new InputView();
    private final OutputView outputView = new OutputView();
    private Computer computer;

    public void startGame() {
        boolean isContinue;
        do {
            computer = Computer.saveComputerNumber(generateThreeNumber());
            repeatGame();
            outputView.printFinishMessage();
            Command command = inputView.readGameCommand();
            isContinue = command.isRestart();
        } while (isContinue);
    }

    private void repeatGame() {
        boolean isSuccess = false;
        while (!isSuccess) {
            Player player = new Player(inputView.readNumbers());
            Counting counting = computer.compareResult(player.getNumbers());
            outputView.printResult(counting.toString());
            isSuccess = counting.isFinish();
        }
    }

    public List<Integer> generateThreeNumber() {
        List<Integer> computerNumbers = new ArrayList<>();
        while (computerNumbers.size() < 3) {
            int randomNumber = Randoms.pickNumberInRange(1, 9);
            if (!computerNumbers.contains(randomNumber)) {
                computerNumbers.add(randomNumber);
            }
        }
        return computerNumbers;
    }
}