package baseball.domain;

import baseball.constant.Result;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CountingTest {

    @DisplayName("2스트라이크")
    @Test
    void twoStrike() {
        Counting counting = new Counting();
        counting.saveResult(Result.STRIKE);
        counting.saveResult(Result.STRIKE);
        Assertions.assertThat(counting.toString()).isEqualTo("2스트라이크");
    }

    @DisplayName("3스트라이크")
    @Test
    void isFinishTest() {
        Counting counting = new Counting();
        counting.saveResult(Result.STRIKE);
        counting.saveResult(Result.STRIKE);
        counting.saveResult(Result.STRIKE);
        Assertions.assertThat(counting.isFinish()).isTrue();
    }
}