package src.easy;

import java.util.HashMap;

public class PermutationDifference2Strings {
 //abc bac
    public int findPermutationDifference(String s, String t) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < t.length(); j++) {
                if(s.charAt(i) == t.charAt(j)) {
                    result += Math.abs(i - j);
                }
            }
        }
        return result;
    }

    public int findPermutationDifferenceWithHash(String s, String t) {
        HashMap<Character, Integer> map = new HashMap();
        for (int i = 0; i < s.length(); i++){
            map.put(s.charAt(i), i);
        }
        int ans = 0;
        for (int i = 0; i < t.length(); i++){
            ans += Math.abs(i - map.get(t.charAt(i)));
        }
        return ans;
    }

}
