package baseball;

import baseball.constant.Message;
import baseball.controller.GameController;

public class Application {
    public static void main(String[] args) {
        System.out.println(Message.START_GAME_MESSAGE);
        GameController gameController = new GameController();
        gameController.startGame();
    }
}