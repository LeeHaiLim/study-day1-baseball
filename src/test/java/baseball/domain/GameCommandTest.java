package baseball.domain;

import baseball.Application;
import camp.nextstep.edu.missionutils.test.NsTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static camp.nextstep.edu.missionutils.test.Assertions.assertRandomNumberInRangeTest;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class GameCommandTest extends NsTest {

    @DisplayName("재시작 관련 입력에 1 혹은 2 이외의 값이 입력되면 예외가 발생한다.")
    @ValueSource(strings = {"a", "0"})
    @ParameterizedTest
    void insertInvalidReGameInput(String input) {
        assertRandomNumberInRangeTest(
                () -> assertThatThrownBy(() -> run("246", "135", input))
                        .isInstanceOf(IllegalArgumentException.class),
                1, 3, 5, 5, 8, 9
        );
    }

    @Override
    protected void runMain() {
        Application.main(new String[]{});
    }
}
