package baseball.util;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NumberGenerator {

    private static final int MiN_NUM = 1;
    private static final int MAX_NUM = 9;

    public static List<Integer> getGameNumbers() {
        Set<Integer> randomNumbers = new HashSet<>();
        while(randomNumbers.size()<3) {
            randomNumbers.add(Randoms.pickNumberInRange(MiN_NUM, MAX_NUM));
        }
        return new ArrayList<>(randomNumbers);
    }
}
