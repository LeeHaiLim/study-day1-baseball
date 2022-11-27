package baseball.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GameNumberTest {

    UserNumber userNumber;
    GameNumber gameNumber;

    @BeforeEach
    void setUp() {
        userNumber = new UserNumber(List.of(1, 2, 3));
        gameNumber = new GameNumber(List.of(3, 2, 1));
    }

    @DisplayName("볼 개수 반환 기능 테스트")
    @Test
    void getBallsTest() {
        int balls = gameNumber.getBallNumbers(userNumber, 1);
        Assertions.assertThat(balls).isEqualTo(2);
    }

    @DisplayName("스트라이크 개수 반환 기능 테스트")
    @Test
    void getStrikesTest() {
        int strikes = gameNumber.getStrikeNumbers(userNumber);
        Assertions.assertThat(strikes).isEqualTo(1);
    }

    @DisplayName("볼 / 스트라이크 개수 반환 기능 테스트")
    @Test
    void getBallsAndStrikesTest() {
        int strike = gameNumber.getStrikeNumbers(userNumber);
        int balls = gameNumber.getBallNumbers(userNumber, strike);

        Assertions.assertThat(strike).isEqualTo(1);
        Assertions.assertThat(balls).isEqualTo(2);
    }
}
