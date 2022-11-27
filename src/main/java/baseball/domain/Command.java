package baseball.domain;

import baseball.constant.ErrorMessage;

public class Command {
    private final int RESTART = 1;
    private final int QUIT = 2;
    private final int command;

    public Command(String command) {
        validCommand(command);
        this.command = Integer.parseInt(command);
    }

    public boolean isRestart() {
        if (command == RESTART) {
            return true;
        }
        return false;
    }

    private void validCommand(String command) {
        if (Integer.parseInt(command) != 1 && Integer.parseInt(command) != 2) {
            throw new IllegalArgumentException(ErrorMessage.NOT_NUMBER_COMMAND.getMessage());
        }
    }
}