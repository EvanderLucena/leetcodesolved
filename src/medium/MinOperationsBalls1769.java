package src.medium;

import java.util.HashMap;

public class MinOperationsBalls1769 {
    public int[] minOperations(String boxes) {
        int[] result = new int[boxes.length()];
        char[] charArray = boxes.toCharArray();
        HashMap<Integer, Character> mapBox = new HashMap<>();
        for (int i = 0; i < boxes.length(); i++) {
            mapBox.put(i, charArray[i]);
        }
        for (int i = 0; i < boxes.length(); i++) {
            for (int j = i + 1; j < boxes.length(); j++) {
                if (boxes.charAt(j) == '1') {
                    result[i] += Math.abs(Character.getNumericValue(boxes.charAt(i)) - Character.getNumericValue(boxes.charAt(j)));
                }
            }
        }
        return result;
    }
}
