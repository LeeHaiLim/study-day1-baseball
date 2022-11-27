package baseball.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

class ComputerTest {
    private Computer computer;

    @BeforeEach
    void init() {
        computer = Computer.saveComputerNumber(List.of(1, 2, 3));
    }

    @DisplayName("1개의 자리가 일치하면 1스트라이크")
    @Test
    void compareResultStrikeTest() {
        Counting counting = computer.compareResult(List.of(1, 4, 5));
        Assertions.assertThat(counting.toString()).isEqualTo("1스트라이크");
    }

    @DisplayName("3개가 포함되어 있으면 3볼")
    @Test
    void compareResultBallTest() {
        Counting counting = computer.compareResult(List.of(3, 1, 2));
        Assertions.assertThat(counting.toString()).isEqualTo("3볼");
    }

    @DisplayName("모두 일치하면 3스트라이크")
    @Test
    void compareResultSuccessTest() {
        Counting counting = computer.compareResult(List.of(1, 2, 3));
        Assertions.assertThat(counting.toString()).isEqualTo("3스트라이크");
    }

    @DisplayName("2볼 1스트라이크")
    @Test
    void compareResultStrikeBallTest() {
        Counting counting = computer.compareResult(List.of(1, 3, 2));
        Assertions.assertThat(counting.toString()).isEqualTo("2볼 1스트라이크");
    }
}