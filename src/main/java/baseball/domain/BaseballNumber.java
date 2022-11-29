package baseball.domain;

import static baseball.util.Constants.BASEBALL_NUMBER_RANGE_START;
import static baseball.util.Constants.BASEBALL_NUMBER_RANGE_END;
import static baseball.util.ErrorMessage.NUMBER_RANGE;

import java.util.Objects;

public final class BaseballNumber {
    private final int number;

    public BaseballNumber(int number) {
        validate(number);
        this.number = number;
    }

    private void validate(int number) {
        if (number < BASEBALL_NUMBER_RANGE_START || number > BASEBALL_NUMBER_RANGE_END) {
            throw new IllegalArgumentException(
                    String.format(NUMBER_RANGE.message(), BASEBALL_NUMBER_RANGE_START, BASEBALL_NUMBER_RANGE_END));
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BaseballNumber that = (BaseballNumber) o;
        return number == that.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }
}
