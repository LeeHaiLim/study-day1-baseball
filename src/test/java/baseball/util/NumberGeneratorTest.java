package baseball.util;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

class NumberGeneratorTest {

    final int MAX_NUM = 9;
    final int MIN_NUM = 1;
    final int VALID_SIZE = 3;

    @DisplayName("생성된 랜덤 숫자 범위 테스트")
    @Test
    void createRandomNumbersRangeTest() {
        List<Integer> gameNumbers = NumberGenerator.getGameNumbers();
        Assertions.assertThat(gameNumbers)
                .allMatch(number -> (number <= MAX_NUM && number >= MIN_NUM));
    }

    @DisplayName("생성된 랜덤 숫자 개수 테스트")
    @Test
    void createRandomNumbersSizeTest() {
        List<Integer> gameNumbers = NumberGenerator.getGameNumbers();
        Assertions.assertThat(gameNumbers.size()).isEqualTo(VALID_SIZE);
    }
}
