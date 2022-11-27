package baseball.util;

public enum ErrorMessage {
    NUMBER_SIZE("숫자 %d개를 입력해야 합니다."),
    NUMBER_RANGE("%d부터 %d 사이의 숫자를 입력해야 합니다."),
    NUMBER_NOT_NUMBER("숫자를 입력해야 합니다."),
    NUMBER_DISTINCT("서로 다른 숫자를 입력해야 합니다."),
    GAME_COMMAND("%s 또는 %s를 입력해야 합니다.");

    private final String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    public String message() {
        return message;
    }
}
