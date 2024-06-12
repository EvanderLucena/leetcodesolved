package src.easy;

public class ReversePrefixOfWord {
    public String reversePrefix(String word, char ch) {
        StringBuilder reverseBuilder = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ch) {
                String substring = word.substring(0, i+1);
                String endWord = word.substring(i+1);
                for (int j = substring.length() -1; j >= 0; j--) {
                    reverseBuilder.append(substring.charAt(j));
                }
                reverseBuilder.append(endWord);
                break;
            }
        }
        if (reverseBuilder.isEmpty()){
            return word;
        }
        return reverseBuilder.toString();
    }
}
