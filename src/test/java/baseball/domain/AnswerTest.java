package baseball.domain;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AnswerTest {
    @DisplayName("항목이 3개가 아닐 경우 예외가 발생한다.")
    @Test
    void numberSizeTest() {
        assertThatThrownBy(() -> new Answer(List.of(
                new BaseballNumber(1), new BaseballNumber(2), new BaseballNumber(3), new BaseballNumber(4))))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("항목이 모두 다르지 않은 경우 예외가 발생한다.")
    @Test
    void numberDistinctTest() {
        assertThatThrownBy(() -> new Answer(List.of(
                new BaseballNumber(1), new BaseballNumber(2), new BaseballNumber(2))))
                .isInstanceOf(IllegalArgumentException.class);
    }
}
