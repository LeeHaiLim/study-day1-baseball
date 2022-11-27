package baseball.domain;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class BaseballNumberTest {
    @DisplayName("숫자가 1부터 9사이의 숫자가 아닌 경우 예외가 발생한다.")
    @ValueSource(strings = {"0", "-10", "10", "100"})
    @ParameterizedTest
    void numberRangeTest(String input) {
        assertThatThrownBy(() -> new BaseballNumber(Integer.parseInt(input)))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("값이 같으면 참을 반환한다.")
    @Test
    void equalTest() {
        BaseballNumber number1 = new BaseballNumber(1);
        BaseballNumber number2 = new BaseballNumber(1);

        assertThat(number1).isEqualTo(number2);
    }
}
