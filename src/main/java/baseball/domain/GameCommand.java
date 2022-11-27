package baseball.domain;

import static baseball.util.Constants.FLAG_GAME_RESTART;
import static baseball.util.Constants.FLAG_GAME_QUIT;

public final class GameCommand {
    private final String command;

    public GameCommand(String command) {
        validate(command);
        this.command = command;
    }

    private void validate(String command) {
        if (!command.equals(FLAG_GAME_RESTART) && !command.equals(FLAG_GAME_QUIT)) {
            throw new IllegalArgumentException();
        }
    }

    public boolean isRestart() {
        return command.equals(FLAG_GAME_RESTART);
    }
}
