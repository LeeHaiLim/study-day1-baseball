package baseball.view;

import baseball.constant.ErrorMessage;
import baseball.domain.Command;
import camp.nextstep.edu.missionutils.Console;

public class InputView {

    public String readNumbers() {
        String inputNumbers = Console.readLine();
        validIsDigit(inputNumbers);
        return inputNumbers;
    }

    public Command readGameCommand() {
        String inputCommand = Console.readLine();
        validIsDigit(inputCommand);
        return new Command(inputCommand);
    }

    private void validIsDigit(String numbers) {
        if (!numbers.chars().allMatch(Character::isDigit)) {
            throw new IllegalArgumentException(ErrorMessage.NOT_DIGIT_ERROR.getMessage());
        }
    }
}
