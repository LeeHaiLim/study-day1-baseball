package baseball.view;

import baseball.constant.Message;

public class OutputView {
    public void printResult(String result) {
        System.out.println(result);
    }

    public void printFinishMessage() {
        System.out.println(Message.FINISH_GAME_MESSAGE);
    }
}