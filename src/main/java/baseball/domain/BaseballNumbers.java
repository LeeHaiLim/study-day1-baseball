package baseball.domain;

import static baseball.util.Constants.BASEBALL_NUMBER_SIZE;
import static baseball.util.ErrorMessage.NUMBER_DISTINCT;
import static baseball.util.ErrorMessage.NUMBER_SIZE;

import java.util.List;
import java.util.stream.Stream;

public abstract class BaseballNumbers {
    private final List<BaseballNumber> numbers;

    public BaseballNumbers(List<BaseballNumber> numbers) {
        validate(numbers);
        this.numbers = numbers;
    }

    private void validate(List<BaseballNumber> numbers) {
        isValidSize(numbers);
        isDistinct(numbers);
    }

    private void isValidSize(List<BaseballNumber> numbers) {
        if (numbers.size() != BASEBALL_NUMBER_SIZE) {
            throw new IllegalArgumentException(
                    String.format(NUMBER_SIZE.message(), BASEBALL_NUMBER_SIZE));
        }
    }

    private void isDistinct(List<BaseballNumber> numbers) {
        if (numbers.stream().distinct().count() != numbers.size()) {
            throw new IllegalArgumentException(NUMBER_DISTINCT.message());
        }
    }

    public int indexOf(BaseballNumber number) {
        return numbers.indexOf(number);
    }

    public boolean contains(BaseballNumber number) {
        return numbers.contains(number);
    }

    public Stream<BaseballNumber> stream() {
        return numbers.stream();
    }
}
