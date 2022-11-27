package baseball.model;

import java.util.ArrayList;
import java.util.List;

import static baseball.validate.Validate.*;
import static baseball.validate.Validate.isDuplicate;

public class PitcherNumber {
    List<Integer> number;

    public PitcherNumber(String input) {
        number = new ArrayList<>();
        validateNumber(input);

        for(String num : input.split("")) {
            number.add(Integer.parseInt(num));
        }
    }

    private void validateNumber(String input) {
        isBlank(input);
        isThreeDigits(input);
        isNumberBetweenOneAndNine(input);
        isDuplicate(input);
    }

    public int indexOf(int num) {
        return number.indexOf(num);
    }

    public List<Integer> getNumber() {
        return number;
    }
}
