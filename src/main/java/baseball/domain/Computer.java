package baseball.domain;

import java.util.List;

public class Computer {
    private final List<Integer> threeNumbers;

    private Computer(List<Integer> threeNumbers) {
        this.threeNumbers = threeNumbers;
    }

    public static Computer saveComputerNumber(List<Integer> threeNumbers) {
        return new Computer(threeNumbers);
    }
}