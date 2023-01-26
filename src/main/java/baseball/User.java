package baseball;

import java.util.Scanner;

public class User {
    Scanner scanner = new Scanner(System.in);

    int[] submitNumber() {
        System.out.print("3자리 수를 입력하세요 :  ");
        int answer = scanner.nextInt();
        int[] answerArray = new int[3];

        for (int i = 0; i < 3; i++) {
            //int divideNumber = (10 ^ (3 - i)) / (10 ^ (2 - i));
            answerArray[i] = answer % 10;
            answer /= 10;
        }
        return answerArray;
    }
}
