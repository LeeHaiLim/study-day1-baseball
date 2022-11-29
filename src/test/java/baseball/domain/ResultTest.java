package baseball.domain;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ResultTest {
    private final Answer answer = new Answer(
            List.of(new BaseballNumber(1), new BaseballNumber(2), new BaseballNumber(3)));

    @DisplayName("정확한 결과를 반환한다.")
    @ValueSource(strings = {"451,1,0", "412,2,0", "312,3,0",
            "145,0,1", "124,0,2", "123,0,3",
            "456,0,0", "135,1,1", "321,2,1"})
    @ParameterizedTest
    void resultTest(String input) {
        String[] inputs = input.split(",");
        Guess guess = new Guess(inputs[0]);
        Result result = new Result(answer, guess);
        assertThat(result.getBall()).isEqualTo(Integer.parseInt(inputs[1]));
        assertThat(result.getStrike()).isEqualTo(Integer.parseInt(inputs[2]));
    }
}
