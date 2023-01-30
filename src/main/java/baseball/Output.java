package baseball;

public class Output {
    void print() {
        int strike = Comparison.score.get("Strike");
        int ball = Comparison.score.get("Ball");

        if (strike == 0 && ball == 0) {
            System.out.println("낫싱");
        } else {
            printStrike(strike);
            printBall(ball);
            System.out.println();
        }
    }

    void printStrike(int strike) {
        if (strike != 0) {
            System.out.print(strike + "스트라이크\t");
        }
    }

    void printBall(int ball) {
        if (ball != 0) {
            System.out.print(ball + "볼\t");
        }
    }
}
