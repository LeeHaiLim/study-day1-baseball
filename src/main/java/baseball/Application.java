package baseball;

public class Application {
    public static void main(String[] args) {
        BaseballController controller = new BaseballController();
        try {
            controller.run();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
}
