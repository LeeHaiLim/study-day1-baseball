package baseball.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class PlayerTest {

    @DisplayName("1~9사이의 숫자를 입력해야 한다.")
    @ParameterizedTest
    @ValueSource(strings = {"012", "102"})
    void playerNumberRangeTest(String input) {
        Assertions.assertThatThrownBy(() -> new Player(input))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("3자리의 숫자를 입력해야 한다.")
    @ParameterizedTest
    @ValueSource(strings = {"12", "1", ""})
    void playerNumberDigitTest(String input) {
        Assertions.assertThatThrownBy(() -> new Player(input))
                .isInstanceOf(IllegalArgumentException.class);
    }
}