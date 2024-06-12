package src.easy;

import java.util.HashSet;

public class GoalParserInterpretation {
    public String interpret(String command) {
        StringBuilder goal = new StringBuilder();
        for (int i = 0; i < command.length(); i++) {
            if (command.charAt(i) == 'G') {
                goal.append("G");
            }else if (command.charAt(i) == '(' && command.charAt(i+1) == 'a') {
                goal.append("al");
            }else if (command.charAt(i) == '(') {
                goal.append("o");
            }
        }
        return goal.toString();
    }
}
