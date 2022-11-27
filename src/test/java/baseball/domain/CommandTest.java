package baseball.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class CommandTest {

    @DisplayName("1또는 2를 입력해야 한다.")
    @ParameterizedTest
    @ValueSource(strings = {"1", "2"})
    void commandTest(String input) {
        Command command = new Command(input);
    }

    @DisplayName("1또는 2가 아닐 경우 예외가 발생한다.")
    @ParameterizedTest
    @ValueSource(strings = {"3", "4", "ㅋㅋ", " "})
    void commandErrorTest(String input) {
        Assertions.assertThatThrownBy(() -> new Command(input))
                .isInstanceOf(IllegalArgumentException.class);
    }
}