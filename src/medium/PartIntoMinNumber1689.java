package src.medium;

import java.util.HashMap;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class PartIntoMinNumber1689 {
    public int minPartitions(String n) {
        int max = 0;
        char[] charArray = n.toCharArray();

        for (char c : charArray) {
            max = Math.max(max, Character.getNumericValue(c));
        }
        return max;
    }
}
