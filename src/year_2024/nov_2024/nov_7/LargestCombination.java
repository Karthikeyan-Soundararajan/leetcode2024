package year_2024.nov_2024.nov_7;

import java.util.Collections;
import java.util.stream.IntStream;

public class LargestCombination {

    public int largestCombination(int[] candidates) {
        int[] maxBits = new int[24];
        for (int i = 0; i < candidates.length; i++) {
            String binary = Integer.toBinaryString(candidates[i]);
            int k=0;
            for (int j = binary.length()-1; j >=0; j--) {
                maxBits[k++] += binary.charAt(j) - '0';
            }
        }
        return IntStream.of(maxBits).boxed().sorted(Collections.reverseOrder()).findFirst().get();
    }

    public static void main(String[] args) {
        LargestCombination largestCombination = new LargestCombination();
        System.out.println(largestCombination.largestCombination(new int[]{16,17,71,62,12,24,14}));
    }
}
