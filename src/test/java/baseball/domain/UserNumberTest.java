package baseball.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

class UserNumberTest {

    @DisplayName("0이 포함된 숫자 리스트를 입력하면 예외를 발생한다.")
    @Test
    void insertUserNumberWithZero() {
        List<Integer> inputNumbers = List.of(0, 1, 2);
        Assertions.assertThatThrownBy(() -> new UserNumber(inputNumbers))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("입력된 숫자에 0이 포함되어 있습니다.");
    }

    @DisplayName("중복된 숫자가 포함된 리스트를 입력하면 예외를 발생한다.")
    @Test
    void insertUserNumberWithDuplication() {
        List<Integer> inputNumbers = List.of(1, 1, 2);
        Assertions.assertThatThrownBy(() -> new UserNumber(inputNumbers))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("중복된 숫자가 포함되어 있습니다.");
    }
}
