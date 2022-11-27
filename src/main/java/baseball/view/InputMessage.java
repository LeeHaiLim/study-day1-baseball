package baseball.view;

import static baseball.util.Constants.FLAG_GAME_RESTART;
import static baseball.util.Constants.FLAG_GAME_QUIT;

public enum InputMessage {

    NUMBER("숫자를 입력해주세요 : "),
    GAME_COMMAND(String.format("게임을 새로 시작하려면 %s, 종료하려면 %s를 입력하세요.",
            FLAG_GAME_RESTART, FLAG_GAME_QUIT));

    private final String message;

    InputMessage(String message) {
        this.message = message;
    }

    public String message() {
        return message;
    }
}
