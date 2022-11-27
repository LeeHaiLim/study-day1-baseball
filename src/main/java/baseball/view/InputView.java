package baseball.view;

import static camp.nextstep.edu.missionutils.Console.readLine;
import static baseball.view.InputMessage.NUMBER;
import static baseball.view.InputMessage.GAME_COMMAND;

public class InputView {
    public String readInputNumber() {
        System.out.print(NUMBER.message());
        return readLine().trim();
    }

    public String readInputGameCommand() {
        System.out.println(GAME_COMMAND.message());
        return readLine().trim();
    }
}
