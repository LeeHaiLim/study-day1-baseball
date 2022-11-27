package baseball.ui;

public class OutputView {

    public static void printGameStartMessage() {
        System.out.println("숫자 야구 게임을 시작합니다.");
    }

    public static void askNumber() {
        System.out.println("숫자를 입력해 주세요.");
    }

    public static void printNothing() {
        System.out.println("낫싱");
    }

    public static void printResult(int strikes, int balls) {
        StringBuilder result = new StringBuilder();
        saveBallResult(result,balls);
        saveStrikeResult(result, strikes);
        System.out.println(result);
    }

    public static void printWinningMessage() {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
    }

    private static void saveStrikeResult(StringBuilder result, int strikes) {
        if (strikes != 0) {
            result.append(strikes + "스트라이크");
        }
    }

    private static void saveBallResult(StringBuilder result, int balls) {
        if (balls != 0) {
            result.append(balls + "볼 ");
        }
    }
}
