package baseball.model;

public enum RestartOrQuit {
    RESTART("1"),
    QUIT("2");
    private String command;

    RestartOrQuit(String command) {
        this.command = command;
    }

    public static boolean isRightCommand(String input) {
        for(RestartOrQuit restartOrQuit : values()) {
            if(restartOrQuit.command.equals(input)) {
                return true;
            }
        }
        return false;
    }

    public String getCommand() {
        return command;
    }
}
