package baseball.controller;

import baseball.model.BaseBallGame;
import baseball.view.View;

public class BaseBallGameController {

    private final View view = new View();
    private BaseBallGame baseBallGame;

    public void run() {
        view.startGame();
        while(true) {
            baseBallGame = new BaseBallGame();
            playGame();
            if (baseBallGame.isQuit(view.restartOrQuit())) {
                break;
            }
        }
    }

    private void playGame() {
        while (true) {
            baseBallGame.setPitcherNumber(view.enterNumber());
            baseBallGame.judge();
            view.printJudgement(baseBallGame.getReferee());
            if(baseBallGame.isStrikeOut()){
                view.strikeOut();
                break;
            }
        }
    }
}
