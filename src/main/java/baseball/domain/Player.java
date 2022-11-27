package baseball.domain;

import baseball.constant.Constant;
import baseball.constant.ErrorMessage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Player {
    public static final char ZERO_CHAR = '0';
    private final List<Integer> numbers;

    public Player(String numbers) {
        validNumberRange(numbers);
        validDuplicateNumber(numbers);
        validIsThreeNumber(numbers);
        this.numbers = savePlayerNumber(numbers);
    }

    public List<Integer> getNumbers() {
        return Collections.unmodifiableList(numbers);
    }

    private List<Integer> savePlayerNumber(String numbers) {
        List<Integer> threeNumbers = new ArrayList<>();
        numbers.chars().forEach(num -> threeNumbers.add(num - ZERO_CHAR));
        return threeNumbers;
    }

    private void validNumberRange(String numbers) {
        if (!numbers.chars().allMatch(num -> checkNumberRange((char) num))) {
            throw new IllegalArgumentException(ErrorMessage.NOT_NUMBER_RANGE.getMessage());
        }
    }

    private boolean checkNumberRange(char number) {
        if ((number - ZERO_CHAR) < Constant.NUMBER_RANGE_MIN || (number - ZERO_CHAR) > Constant.NUMBER_RANGE_MAX) {
            return false;
        }
        return true;
    }

    private void validDuplicateNumber(String numbers) {
        if (numbers.chars().distinct().count() != numbers.length()) {
            throw new IllegalArgumentException(ErrorMessage.DUPLICATE_NUMBER_ERROR.getMessage());

        }
    }

    private void validIsThreeNumber(String numbers) {
        if (numbers.length() != Constant.THREE_NUMBER_LIMIT) {
            throw new IllegalArgumentException(ErrorMessage.NOT_THREE_NUMBER_ERROR.getMessage());
        }
    }
}