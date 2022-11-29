package baseball.domain;

import static baseball.util.ErrorMessage.NUMBER_NOT_NUMBER;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Guess extends BaseballNumbers {
    public Guess(String numbers) {
        super(toNumbers(numbers));
    }

    private static List<BaseballNumber> toNumbers(String numbers) {
        try {
            return Arrays.stream(numbers.split(""))
                    .map(Integer::parseInt)
                    .map(BaseballNumber::new)
                    .collect(Collectors.toList());
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(NUMBER_NOT_NUMBER.message());
        }
    }
}
