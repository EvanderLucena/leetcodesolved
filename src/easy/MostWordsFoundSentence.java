package src.easy;

import java.util.Arrays;
import java.util.HashMap;

public class MostWordsFoundSentence {
    public int mostWordsFound(String[] sentences) {
        HashMap<Integer, String> stringHashMap = new HashMap<>();
        int i = 0;
        int sum = 0;
        for (String word : sentences) {
            stringHashMap.put(i, word);
            i++;
        }
        for (String sentence : stringHashMap.values()) {
            long count = Arrays.stream(sentence.split(" ")).count();
            if (count > sum) {
                sum = (int) count;
            }
        }
        return sum;
    }
    public int mostWordsFoundBetter(String[] sentences) {
        int count=0;
        for(String s:sentences){
            count=Math.max(count,s.split(" ").length);
        }
        return count;
    }
}
