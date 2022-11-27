package baseball.model;

import java.util.List;

public class Catcher {
    CatcherNumber catcherNumber;

    public Catcher(List<Integer> computerNumber) {
        this.catcherNumber = new CatcherNumber(computerNumber);
    }

    public CatcherNumber getCatcherNumber() {
        return catcherNumber;
    }
}
