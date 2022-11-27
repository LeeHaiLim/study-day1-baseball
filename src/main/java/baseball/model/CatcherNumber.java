package baseball.model;

import java.util.List;

public class CatcherNumber {
    List<Integer> number;

    public CatcherNumber(List<Integer> computerNumber) {
        number = computerNumber;
    }

    public boolean contains(int num) {
        return number.contains(num);
    }

    public int indexOf(int num) {
        return number.indexOf(num);
    }

    public List<Integer> getNumber() {
        return number;
    }
}
