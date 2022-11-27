package baseball.domain;

import static baseball.util.BaseballNumberGenerator.generateRandomNumber;
import static baseball.util.Constants.BASEBALL_NUMBER_SIZE;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Answer {
    private final List<BaseballNumber> numbers;

    public Answer(List<BaseballNumber> numbers) {
        validate(numbers);
        this.numbers = numbers;
    }

    private void validate(List<BaseballNumber> numbers) {
        //todo: validation logic
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
}
