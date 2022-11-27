package baseball;

import baseball.domain.GameCommand;

public class Application {
    public static void main(String[] args) {
        BaseballController controller = new BaseballController();
        controller.run();
    }
}
