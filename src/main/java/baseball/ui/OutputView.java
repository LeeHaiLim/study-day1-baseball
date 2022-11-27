package baseball.ui;

public class OutputView {

    private static final String START_MESSAGE = "숫자 야구 게임을 시작합니다.";
    private static final String ASK_NUMBER_MESSAGE = "숫자를 입력해 주세요.";
    private static final String NOTHING_MESSAGE = "낫싱";
    private static final String BALL_MESSAGE = "볼 ";
    private static final String STRIKE_MESSAGE = "스트라이크";
    private static final String WIN_GAME_MESSAGE = "3개의 숫자를 모두 맞히셨습니다! 게임 종료";
    private static final String ASK_GAME_COMMAND_MESSAGE = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";

    public static void printGameStartMessage() {
        System.out.println(START_MESSAGE);
    }

    public static void askNumber() {
        System.out.println(ASK_NUMBER_MESSAGE);
    }

    public static void printNothing() {
        System.out.println(NOTHING_MESSAGE);
    }

    public static void printResult(int strikes, int balls) {
        StringBuilder result = new StringBuilder();
        saveBallResult(result, balls);
        saveStrikeResult(result, strikes);
        System.out.println(result);
    }

    public static void printWinningMessage() {
        System.out.println(WIN_GAME_MESSAGE);
        System.out.println(ASK_GAME_COMMAND_MESSAGE);
    }

    private static void saveStrikeResult(StringBuilder result, int strikes) {
        if (strikes != 0) {
            result.append(strikes + STRIKE_MESSAGE);
        }
    }

    private static void saveBallResult(StringBuilder result, int balls) {
        if (balls != 0) {
            result.append(balls + BALL_MESSAGE);
        }
    }
}
