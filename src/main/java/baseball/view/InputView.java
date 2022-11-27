package baseball.view;

import baseball.constant.ErrorMessage;
import camp.nextstep.edu.missionutils.Console;

public class InputView {

    public String readNumbers() {
        String inputNumbers = Console.readLine();
        validIsDigit(inputNumbers);
        return inputNumbers;
    }

    private void validIsDigit(String numbers) {
        if (!numbers.chars().allMatch(Character::isDigit)) {
            throw new IllegalArgumentException(ErrorMessage.NOT_DIGIT_ERROR.getMessage());
        }
    }
}
