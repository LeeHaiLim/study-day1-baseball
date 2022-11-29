package baseball.domain;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class GuessTest {
    @DisplayName("숫자가 아닌 문자가 있을 경우 예외가 발생한다.")
    @Test
    void numberDistinctTest() {
        assertThatThrownBy(() -> new Guess("abc"))
                .isInstanceOf(IllegalArgumentException.class);
    }
}
