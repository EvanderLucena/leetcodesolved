package exercicies.beginner;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numToIndex = new HashMap<>();

        // Itera pelo array nums
        for (int i = 0; i < nums.length; i++) {
            //i=0
            //i=1
            //i=2

            // Calcula o complemento necessário para atingir o target
            int complement = target - nums[i];
            //3 = 6 - 3
            //4 = 6 - 2
            //2 = 6 - 4

            // Verifica se o complemento já está no HashMap
            if (numToIndex.containsKey(complement)) {
                // Se estiver, retorna os índices do complemento e do número atual
                return new int[]{numToIndex.get(complement), i};
            }

            // Adiciona o número atual e seu índice ao HashMap
            numToIndex.put(nums[i], i);
            //numIndex = 3, 0
            //numIndex = 2, 1
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
