package year_2024.nov_2024.nov_7;

public class LargestCombinationII {

    public int largestCombination(int[] candidates) {
        // Initialize an array to store the count of each bit position.
        int[] bitCount = new int[24];
        for (int i = 0; i < 24; i++) {
            for (int num : candidates) {
                if ((num & (1 << i)) != 0) {
                    bitCount[i]++;
                }
            }
        }
        // Return the maximum count.
        int max = 0;
        for (int count : bitCount) {
            if (count > max) {
                max = count;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        LargestCombinationII largestCombinationII = new LargestCombinationII();
        System.out.println(largestCombinationII.largestCombination(new int[]{16,17,71,62,12,24,14}));
    }
}
