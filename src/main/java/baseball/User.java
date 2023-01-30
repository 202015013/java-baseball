package baseball;

import java.util.Scanner;

public class User {
    Scanner scanner = new Scanner(System.in);
    int[] answerArray;

    int[] submit() {
        answerArray = new int[3];
        try {
            splitNumber(Integer.parseInt(input()));
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        return answerArray;
    }

    private String input() {
        System.out.print("3자리 수를 입력하세요 :  ");
        return scanner.next();
    }

    private void splitNumber(int number) {
        for (int i = 0; i < 3; i++) {
            answerArray[i] = number % 10;
            number /= 10;
        }
    }
}
