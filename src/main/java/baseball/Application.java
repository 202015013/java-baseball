package baseball;

public class Application {
    public static void main(String[] args) {
        Application application = new Application();
        application.run();
    }

    void run() {
        System.out.println("숫자 야구 게임을 시작합니다.");
        Game game = new Game();
        game.start();
    }
}
