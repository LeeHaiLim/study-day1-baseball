package baseball.ui;

import baseball.domain.GameCommand;
import camp.nextstep.edu.missionutils.Console;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class InputView {

    private static final int VALID_SIZE = 3;

    public static List<Integer> readUserNumber() {
        String userNumberInput = Console.readLine();
        isValidLength(userNumberInput);
        isNumeral(userNumberInput);
        return Arrays.stream(userNumberInput.split(""))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }

    public static GameCommand readReGameInput() throws IllegalArgumentException {
        String reGameInput = Console.readLine();
        isNumeral(reGameInput);
        return GameCommand.getGameCommand(Integer.parseInt(reGameInput));
    }

    private static void isValidLength(String userNumberInput) {
        if (userNumberInput.length() != VALID_SIZE) {
            throw new IllegalArgumentException("입력 시 숫자 3개를 입력해야 합니다.");
        }
    }

    private static void isNumeral(String numberInput) {
        try {
            Integer.parseInt(numberInput);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("숫자가 아닌 값이 입력되었습니다.");
        }
    }
}
