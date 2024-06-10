package src.easy;

import java.util.HashMap;

public class FinalValueOfVarPerformingOperations {
    public int finalValueAfterOperations(String[] operations) {
        int X = 0;
        HashMap<Integer, String> mapOperations = new HashMap<>();
        for (int i = 0; i < operations.length; i++) {
            mapOperations.put(i, operations[i]);
        }
        for (int i = 0; i < mapOperations.size(); i++) {
            String operationMaped = mapOperations.get(i);
            if (operationMaped.equals("++X") || operationMaped.equals("X++")) {
                X += 1;
            } else if (operationMaped.equals("--X") || operationMaped.equals("X--")) {
                X -= 1;
            }
        }
        return X;
    }
}
