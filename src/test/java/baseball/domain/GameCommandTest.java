package baseball.domain;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class GameCommandTest {
    @DisplayName("입력값이 1 또는 2가 아닐 경우 예외가 발생한다.")
    @Test
    void gameCommandTest() {
        assertThatThrownBy(() -> new GameCommand("a"))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("입력값이 1인 경우 참을 반환한다.")
    @Test
    void isRestartTest() {
        assertThat(new GameCommand("1").isRestart()).isTrue();
    }

    @DisplayName("입력값이 2인 경우 거짓을 반환한다.")
    @Test
    void notRestartTest() {
        assertThat(new GameCommand("2").isRestart()).isFalse();
    }
}
