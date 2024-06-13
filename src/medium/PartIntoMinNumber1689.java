package src.medium;

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
