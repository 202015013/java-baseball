package baseball;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Game {
    Computer computer = new Computer();
    User user = new User();
    Comparison comparison = new Comparison();
    Output output = new Output();

    void start() {
        int[] answer = computer.makeNumber();
        System.out.println(Arrays.toString(answer));
        while (true) {
            int[] submit = user.submitNumber();
            HashMap<String, Integer> score = comparison.compare(answer, submit);
            if (score.get("Strike") == 3) {
                System.out.println("정답입니다.");
                choose();
                break;
            }
            output.print(score.get("Strike"), score.get("Ball"));
        }
    }

    private void choose() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("재시작 : 1     종료 : 2");
        if (scanner.nextInt() == 1) {
            restart();
        }
    }

    private void restart() {
        start();
    }
}
