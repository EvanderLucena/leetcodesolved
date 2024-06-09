package exercicies.beginner;

import java.util.ArrayList;
import java.util.List;

public class FindWordsContainingCharacter {

    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            List<Integer> resultWord = new ArrayList<>();
            for (int j = 0; j < word.length(); j++) {
                if (word.charAt(j) == x) {
                    if (resultWord.isEmpty()) {
                        resultWord.add(i);
                        result.add(i);
                        break;
                    }

                }
            }
        }
        return result;
    }
}
