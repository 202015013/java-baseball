package baseball;

import java.util.Scanner;

public class Game {
    Computer computer = new Computer();
    User user = new User();
    Comparison comparison = new Comparison();
    Output output = new Output();
    static boolean endSign = false;

    void start() {
        if (!endSign) {
            int[] answer = computer.makeNumber();
            do {
                int[] submit = user.submit();
                comparison.compare(answer, submit);
            }
            while (!isWin());
            choose();
        }
    }

    private boolean isWin() {
        int strike = Comparison.score.get("Strike");
        if (strike == 3) {
            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
            return true;
        } else {
            output.print();
            return false;
        }
    }

    private void choose() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        Scanner scanner = new Scanner(System.in);
        try {
            ChoiceToRestartOrEnd choice = ChoiceToRestartOrEnd.of(scanner.nextInt());
            choice.proceed(this);
        } catch (Exception e) {
            throw new IllegalArgumentException();
        }
    }

    public void end() {
        endSign = true;
        start();
    }
}
