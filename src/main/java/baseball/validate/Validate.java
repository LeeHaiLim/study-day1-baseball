package baseball.validate;

import baseball.model.RestartOrQuit;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Validate {

    private static final String DUPLICATE_EXCEPTION = "입력한 숫자가 중복됩니다.";
    private static final String BLANK_EXCEPTION = "입력된 내용이 없습니다.";
    private static final String NUMBER_EXCEPTION = "입력된 내용이 숫자가 아닙니다.";
    private static final String NUMBER_RANGE_EXCEPTION = " 1 ~ 9 사이의 숫자들로 입력하세요";
    private static final String THREE_DIGITS_EXCEPTION = "입력된 내용이 3자리 수가 아닙니다.";
    private static final String ENTER_ONE_OR_TWO = "입력된 내용이 1 또는 2가 아닙니다.";

    public static void isBlank(String input) {
        if(input.length() == 0) {
            throw new IllegalArgumentException(BLANK_EXCEPTION);
        }
    }

    public static void isThreeDigits(String input) {
        if(input.length() != 3) {
            throw new IllegalArgumentException(THREE_DIGITS_EXCEPTION);
        }
    }

    public static void isNumberBetweenOneAndNine(String input) {
        for(String num: input.split("")) {
            if(!Character.isDigit(num.charAt(0))) {
                throw new IllegalArgumentException(NUMBER_EXCEPTION);
            }
            if(Integer.parseInt(num) == 0) {
                throw new IllegalArgumentException(NUMBER_RANGE_EXCEPTION);
            }
        }
    }

    public static void isDuplicate(String input) {
        List<String> splited = Arrays.stream(input.split(""))
                .distinct()
                .collect(Collectors.toList());
        if(splited.size() != input.length()) {
            throw new IllegalArgumentException(DUPLICATE_EXCEPTION);
        }
    }

    public static void isRestartOrQuit(String input) {
        if(!RestartOrQuit.isRightCommand(input)) {
            throw new IllegalArgumentException(ENTER_ONE_OR_TWO);
        }
    }
}
