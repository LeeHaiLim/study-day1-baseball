package baseball.util;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import util.RandomUniqueNumber;

import java.util.List;

public class RandomUniqueNumberTest {

    @Test
    @DisplayName("랜덤한 번호 만들기")
    void testMakeRandomNum() {
        List<Integer> randomUniqueNumbers = RandomUniqueNumber.getRandomUniqueNumbers(3);

        System.out.println(randomUniqueNumbers);
    }
}
