package baseball.domain;

import java.util.Arrays;

public enum GameCommand {
    RETRY(1),
    QUIT(0);

    private final int reGameInput;

    GameCommand(int reGameInput) {
        this.reGameInput = reGameInput;
    }

    public GameCommand getGameCommand(int reGameInput) {
        return Arrays.stream(GameCommand.values())
                .filter(command -> command.reGameInput == reGameInput)
                .findAny()
                .orElseThrow(() -> {
                    throw new IllegalArgumentException();
                });
    }
}
