package baseball.util;

import static baseball.util.Constants.BASEBALL_NUMBER_RANGE_START;
import static baseball.util.Constants.BASEBALL_NUMBER_RANGE_END;

import camp.nextstep.edu.missionutils.Randoms;

public class BaseballNumberGenerator {
    public static int generateRandomNumber() {
        return Randoms.pickNumberInRange(BASEBALL_NUMBER_RANGE_START, BASEBALL_NUMBER_RANGE_END);
    }
}
