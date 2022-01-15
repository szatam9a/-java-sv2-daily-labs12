package day02;

import java.util.*;

public class MathAlgorithms {
    public int sharedDivisor(int one, int two) {
        HashSet<Integer> div1 = new HashSet<>();
        HashSet<Integer> div2 = new HashSet<>();
        int divider = 1;
        int temp;
        if (one > two) {
            temp = two;
            two = one;
            one = temp;
        }
        for (int i = 1; i <= one; i++) {
            if ((one % i) == 0) div1.add(i);

            if ((two % i) == 0) div2.add(i);

        }
        for (Integer i : div2) {
            if (div1.contains(i) && (i > divider)) {
                divider = i;
            }
        }
        return divider;
    }
}

