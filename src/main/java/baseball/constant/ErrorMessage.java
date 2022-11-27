package baseball.constant;

public enum ErrorMessage {
    DUPLICATE_NUMBER_ERROR("중복된 숫자를 입력할 수 없습니다."),
    NOT_DIGIT_ERROR("숫자만 입력해야 합니다."),
    NOT_NUMBER_RANGE("1~9사이의 숫자를 입력해야 합니다"),
    NOT_NUMBER_COMMAND("게임을 새로 시작하려면 1, 종료하려면 2를 입력해야 합니다.");

    private final String errorPrefix = "[ERROR] ";
    private final String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return errorPrefix + message;
    }
}