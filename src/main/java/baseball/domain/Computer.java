package baseball.domain;

import baseball.constant.Result;

import java.util.List;

public class Computer {
    private final List<Integer> threeNumbers;

    private Computer(List<Integer> threeNumbers) {
        this.threeNumbers = threeNumbers;
    }

    public static Computer saveComputerNumber(List<Integer> threeNumbers) {
        return new Computer(threeNumbers);
    }

    public Counting compareResult(List<Integer> playerNumbers) {
        Counting counting = new Counting();
        for (int i = 0; i < playerNumbers.size(); i++) {
            Result result = Result.getResult(threeNumbers, playerNumbers.get(i), i);
            counting.saveResult(result);
        }
        return counting;
    }
}