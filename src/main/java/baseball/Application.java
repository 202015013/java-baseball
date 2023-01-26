package baseball;

public class Application {
    public static void main(String[] args) {
        Application application = new Application();
        application.run();
    }

    void run() {
        Game game = new Game();
        game.start();
    }
}
