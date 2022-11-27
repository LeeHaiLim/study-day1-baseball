package baseball.constant;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;


class ResultTest {

    @DisplayName("한 자리가 일치하면 스트라이크")
    @Test
    void getResultStrikeTest() {
        List<Integer> computerNumbers = List.of(1,2,3);
        int playerNumber = 1;
        int index = 0;

        Result result = Result.getResult(computerNumbers, playerNumber, index);
        Assertions.assertThat(result).isEqualTo(Result.STRIKE);
    }

    @DisplayName("한 개가 들어있으면 볼")
    @Test
    void getResultBallTest() {
        List<Integer> computerNumbers = List.of(1,2,3);
        int playerNumber = 1;
        int index = 1;

        Result result = Result.getResult(computerNumbers, playerNumber, index);
        Assertions.assertThat(result).isEqualTo(Result.BALL);
    }

    @DisplayName("아무것도 일치하지 않을 때")
    @Test
    void getResultNoneTest() {
        List<Integer> computerNumbers = List.of(1,2,3);
        int playerNumber = 4;
        int index = 1;

        Result result = Result.getResult(computerNumbers, playerNumber, index);
        Assertions.assertThat(result).isEqualTo(Result.NONE);
    }
}