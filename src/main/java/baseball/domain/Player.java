package baseball.domain;

import baseball.constant.ErrorMessage;

import java.util.List;

import static baseball.constant.Constant.*;

public class Player {
    private final List<Integer> numbers;

    public Player(List<Integer> numbers) {
        this.numbers = numbers;
    }

    private void validNumberRange(String numbers) {
        if (numbers.chars().noneMatch(num -> checkNumberRange((char) num))) {
            throw new IllegalArgumentException(ErrorMessage.NOT_NUMBER_RANGE.getMessage());
        }
    }
    private boolean checkNumberRange(char number) {
        if ((number-ZERO_CHAR)<NUMBER_RANGE_MIN || (number-ZERO_CHAR)>NUMBER_RANGE_MAX) {
            return false;
        }
        return true;
    }
}