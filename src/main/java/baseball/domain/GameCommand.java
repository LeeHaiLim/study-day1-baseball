package baseball.domain;

import static baseball.util.Constants.FLAG_GAME_RESTART;
import static baseball.util.Constants.FLAG_GAME_QUIT;
import static baseball.util.ErrorMessage.GAME_COMMAND;

public final class GameCommand {
    private final String command;

    public GameCommand(String command) {
        validate(command);
        this.command = command;
    }

    private void validate(String command) {
        if (!command.equals(FLAG_GAME_RESTART) && !command.equals(FLAG_GAME_QUIT)) {
            throw new IllegalArgumentException(
                    String.format(GAME_COMMAND.message(), FLAG_GAME_RESTART, FLAG_GAME_QUIT));
        }
    }

    public boolean isRestart() {
        return command.equals(FLAG_GAME_RESTART);
    }
}
