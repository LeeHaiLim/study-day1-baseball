package baseball.domain;

import static baseball.util.BaseballNumberGenerator.generateRandomNumber;
import static baseball.util.Constants.BASEBALL_NUMBER_SIZE;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Answer extends BaseballNumbers{

    public Answer(List<BaseballNumber> numbers) {
        super(numbers);
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
