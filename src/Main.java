package src;

public class Main {
    public static void main(String[] args) {
        String boxes = "110";
        Solution solution = new Solution();
        int[] result = solution.minOperations(boxes);

        System.out.print("Result: ");
        for (int res : result) {
            System.out.print(res + " ");
        }
    }
}

class Solution {
    public int[] minOperations(String boxes) {
        int[] result = new int[boxes.length()];
        for (int i = 0; i < boxes.length(); i++) {
            int j = i + 1;
            while (j < boxes.length()) {
                if (boxes.charAt(j) == '1') {
                    int valueI = i + 1;
                    int valueJ = j + 1;
                    result[i] += Math.abs(valueI - valueJ);
                }
                j++;
            }
            j = i - 1;
            while (j >= 0) {
                if (boxes.charAt(j) == '1') {
                    int valueI = i + 1;
                    int valueJ = j + 1;
                    result[i] += Math.abs(valueI - valueJ);

                }
                j--;
            }
        }
        return result;
    }
}
