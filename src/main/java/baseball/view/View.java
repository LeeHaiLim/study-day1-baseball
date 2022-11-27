package baseball.view;

import baseball.model.Referee;
import camp.nextstep.edu.missionutils.Console;

public class View {

    private static final String GAME_START = "숫자 야구 게임을 시작합니다.";
    private static final String ENTER_NUMBER = "숫자를 입력해주세요 : ";
    private static final String BALL = "볼";
    private static final String STRIKE = "스트라이크";
    private static final String NOTHING = "낫싱";
    private static final String STRIKE_OUT = "3개의 숫자를 모두 맞히셨습니다! 게임 종료";
    private static final String RESTART_OR_QUIT = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";

    public void startGame() {
        System.out.println(GAME_START);
    }

    public String enterNumber() {
        System.out.print(ENTER_NUMBER);
        return Console.readLine();
    }

    public void printJudgement(Referee referee) {
        int ballCount = referee.getBallCount();
        int strikeCount = referee.getStrikeCount();

        if(ballCount == 0 && strikeCount == 0) {
            System.out.println(NOTHING);
        }
        if(ballCount > 0 && strikeCount == 0) {
            System.out.println(ballCount + BALL);
        }
        if(ballCount == 0 && strikeCount > 0) {
            System.out.println(strikeCount + STRIKE);
        }
        if(ballCount > 0 && strikeCount > 0) {
            System.out.println(ballCount + BALL + " " + strikeCount + STRIKE);
        }
    }

    public void strikeOut() {
        System.out.println(STRIKE_OUT);
    }

    public String restartOrQuit() {
        System.out.println(RESTART_OR_QUIT);
        return Console.readLine();
    }
}
