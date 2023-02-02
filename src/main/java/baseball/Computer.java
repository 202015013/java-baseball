package baseball;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Random;

public class Computer {
    Random random = new Random();

    int[] makeNumber() {
        LinkedHashSet<Integer> computerNumbers = new LinkedHashSet<>();
        while (computerNumbers.size() < 3) {
            computerNumbers.add(random.nextInt(9) + 1);
        }

        Integer[] computerNumberArray = computerNumbers.toArray(new Integer[0]);

        return Arrays.stream(computerNumberArray).mapToInt(i -> i).toArray();
    }
}
