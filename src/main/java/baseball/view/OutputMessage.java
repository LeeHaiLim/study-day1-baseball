package baseball.view;

import baseball.Constants;

public enum OutputMessage {
    GAME_START("숫자 야구 게임을 시작합니다."),
    GAME_END(String.format("%d개의 숫자를 모두 맞히셨습니다! 게임 종료", Constants.BASEBALL_NUMBER_SIZE));

    private final String message;

    OutputMessage(String message) {
        this.message = message;
    }

    public String message() {
        return message;
    }
}
