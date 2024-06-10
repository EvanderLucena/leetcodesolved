package src.easy;

public class PermutationDifference2Strings {
 //abc bac
    public int findPermutationDifference(String s, String t) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < t.length(); j++) {
                char sChar = s.charAt(i);
                char tChar = t.charAt(j);
                if(sChar == tChar) {
                    result += Math.abs(i - j);
                }
            }
        }
        return result;
    }

}
