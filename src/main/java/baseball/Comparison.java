package baseball;

import java.util.HashMap;

public class Comparison {
    private int strike;
    private int ball;

    private final HashMap<String, Integer> score = new HashMap<>() {{
        put("Strike", strike);
        put("Ball", ball);
    }};

    HashMap<String, Integer> compare(int[] answer, int[] submit) {
        strike = 0;
        ball = 0;
        checkStrikeOrBall(answer, submit);

        score.replace("Strike", strike);
        score.replace("Ball", ball);
        return score;
    }

    private void checkStrikeOrBall(int[] answer, int[] submit) {
        for (int i = 0; i < 3; i++) {
            if (submit[i] == answer[i]) {
                strike++;
            } else {
                checkBall(answer, submit[i]);
            }
        }
    }

    private void checkBall(int[] answer, int number) {
        for (int i = 0; i < 3; i++) {
            if (number == answer[i]) {
                ball++;
            }
        }
    }
}
