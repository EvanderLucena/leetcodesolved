package src.easy;

import java.util.HashMap;

public class JewelsStones {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        HashMap<Integer, Character> mapJewals = new HashMap<>();

        for (int i = 0; i < jewels.length(); i++) {
            mapJewals.put(i, jewels.charAt(i));
            int finalI = i;
            count += (int) stones.chars().filter(c -> c == mapJewals.get(finalI)).count();
        }
        return count;
    }
}
