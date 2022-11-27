package baseball.view;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class InputView {
    public String readInputNumber() {
        System.out.print(InputMessage.NUMBER.message());
        return readLine().trim();
    }
}
