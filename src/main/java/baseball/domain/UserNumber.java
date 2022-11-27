package baseball.domain;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class UserNumber {
    private final List<Integer> userNumbers;

    public UserNumber(List<Integer> userNumbers) {
        isDuplicate(userNumbers);
        isContainingZero(userNumbers);
        this.userNumbers = userNumbers;
    }

    public List<Integer> getUserNumbers() {
        return Collections.unmodifiableList(userNumbers);
    }

    private void isDuplicate(List<Integer> userNumbers) {
        List<Integer> deDuplicatedNumbers = userNumbers.stream()
                .distinct()
                .collect(Collectors.toList());
        if (deDuplicatedNumbers.size() != 3) {
            throw new IllegalArgumentException();
        }
    }

    private void isContainingZero(List<Integer> userNumbers) {
        boolean isContainingZero = userNumbers.stream()
                .anyMatch(number -> number == 0);
        if (isContainingZero) {
            throw new IllegalArgumentException();
        }
    }
}