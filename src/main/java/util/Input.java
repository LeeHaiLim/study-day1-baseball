package util;

import camp.nextstep.edu.missionutils.Console;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Input {
    private final InputValidator inputValidator;

    public Input(InputValidator inputValidator) {
        this.inputValidator = inputValidator;
    }

    public List<Integer> getUserNumbers() {
        String readLine = Console.readLine();

        inputValidator.validateDigits(readLine);

        List<Integer> numbers = Arrays.stream(readLine.split(""))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        inputValidator.validateInputSize(numbers);
        inputValidator.validateDuplicate(numbers);
        inputValidator.validateNumberRange(numbers);
        return numbers;
    }

    public String getCommandAfterGameWin() {
        String readCommand = Console.readLine();
        inputValidator.validateDigits(readCommand);
        inputValidator.validateCommandAfterGame(readCommand);
        return readCommand;
    }
}
