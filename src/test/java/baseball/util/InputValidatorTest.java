package baseball.util;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import util.InputValidator;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class InputValidatorTest {
    private InputValidator inputValidator = new InputValidator();

    @Test
    @DisplayName("숫자가 아닌 값 예외")
    void testValidateDigits() {
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> inputValidator.validateDigits("가나다"));
    }

    @Test
    @DisplayName("배열 크기 예외")
    void testValidateInputSize() {
        List<Integer> list = List.of(1, 2, 3, 4, 4);

        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> inputValidator.validateInputSize(list));
    }

    @Test
    @DisplayName("배열 범위 예외")
    void testValidateNumberRange() {
        List<Integer> list = List.of(9, 10, 11, 22);

        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> inputValidator.validateNumberRange(list));
    }

    @Test
    @DisplayName("1,2 가 아닌 값 예외")
    void testValidateCommandAfterGame() {
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> inputValidator.validateCommandAfterGame("4"));
    }
}
