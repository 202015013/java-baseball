package baseball;

import java.util.HashMap;

public class Comparison {
    private int strike;
    private int ball;
    static final HashMap<String, Integer> score = new HashMap<>() {{
        put("Strike", 0);
        put("Ball", 0);
    }};

    void compare(int[] answer, int[] submit) {
        strike = 0;
        ball = 0;
        checkStrikeOrBall(answer, submit);

        score.replace("Strike", strike);
        score.replace("Ball", ball);
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
