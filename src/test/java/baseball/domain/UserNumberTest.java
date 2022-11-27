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

    @DisplayName("정상적인 숫자 리스트로 객체 생성 테스트")
    @Test
    void insertValidUserNumber() {
        List<Integer> inputNumbers = List.of(1, 2, 3);
        UserNumber userNumber = new UserNumber(inputNumbers);

        Assertions.assertThat(userNumber.getUserNumbers().size()).isEqualTo(3);
    }

    @DisplayName("사용자의 숫자 객체에서 꺼낸 숫자 리스트를 수정하는 경우 예외가 발생한다.")
    @Test
    void changeUserNumber() {
        List<Integer> inputNumbers = List.of(1, 2, 3);
        UserNumber userNumber = new UserNumber(inputNumbers);

        Assertions.assertThatThrownBy(() -> userNumber.getUserNumbers().add(1))
                .isInstanceOf(UnsupportedOperationException.class);
    }
}
