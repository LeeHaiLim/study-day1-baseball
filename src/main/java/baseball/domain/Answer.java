package baseball.domain;

import static baseball.util.BaseballNumberGenerator.generateRandomNumber;
import static baseball.util.Constants.BASEBALL_NUMBER_SIZE;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Answer {
    private final List<BaseballNumber> numbers;

    public Answer(List<BaseballNumber> numbers) {
        validate(numbers);
        this.numbers = numbers;
    }

    private void validate(List<BaseballNumber> numbers) {
        isValidSize(numbers);
        isDistinct(numbers);
    }

    private void isDistinct(List<BaseballNumber> numbers) {
        if (numbers.stream().distinct().count() != numbers.size()) {
            throw new IllegalArgumentException("");
        }
    }

    private void isValidSize(List<BaseballNumber> numbers) {
        if (numbers.size() != BASEBALL_NUMBER_SIZE) {
            throw new IllegalArgumentException("");
        }
    }

    public static Answer generateAnswer() {
        List<Integer> computer = new ArrayList<>();
        while (computer.size() < BASEBALL_NUMBER_SIZE) {
            int randomNumber = generateRandomNumber();
            if (!computer.contains(randomNumber)) {
                computer.add(randomNumber);
            }
        }
        return new Answer(computer.stream().map(BaseballNumber::new).collect(Collectors.toList()));
    }

    public BaseballNumber get(int index) {
        return numbers.get(index);
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
