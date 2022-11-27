package baseball.model;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

import static baseball.validate.Validate.isRestartOrQuit;

public class BaseBallGame {
    Pitcher pitcher;
    Catcher catcher;
    Referee referee;

    public BaseBallGame() {
        this.catcher = new Catcher(generateRandomNumber());
    }

    public void setPitcherNumber(String input) {
        this.pitcher = new Pitcher(input);
    }

    public List<Integer> generateRandomNumber() {
        List<Integer> computerNumber = new ArrayList<>();
        while (computerNumber.size() < 3) {
            int randomNumber = Randoms.pickNumberInRange(1, 9);
            if (!computerNumber.contains(randomNumber)) {
                computerNumber.add(randomNumber);
            }
        }
        return computerNumber;
    }

    public void judge() {
        referee = new Referee(pitcher.pitcherNumber, catcher.catcherNumber);
        referee.judge();
    }

    public boolean isStrikeOut() {
        return referee.isStrikeOut();
    }

    public boolean isQuit(String input) {
        isRestartOrQuit(input);
        if(input.equals(RestartOrQuit.QUIT.getCommand())) {
            return true;
        }
        return false;
    }

    public Referee getReferee() {
        return referee;
    }
}
