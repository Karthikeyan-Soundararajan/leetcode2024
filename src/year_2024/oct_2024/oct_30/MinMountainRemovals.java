package year_2024.oct_2024.oct_30;

import java.util.Arrays;

public class MinMountainRemovals {

    private int[] LongestIncreasingSubsequence(int[] nums) {
        int[] subSeqLen = new int[nums.length];
        Arrays.fill(subSeqLen,1);
        for (int i = 0; i < nums.length; i++) {
            for (int j = i-1; j >= 0 ; j--) {
                if (nums[i] > nums[j]) {
                    subSeqLen[i] = Math.max(subSeqLen[i], subSeqLen[j] + 1);
                }
            }
        }
        return subSeqLen;
    }

    private int[] LongestDecreasingSubsequence(int[] nums) {
        int[] subSeqLen = new int[nums.length];
        Arrays.fill(subSeqLen,1);
        for (int i = nums.length-1; i >= 0; i--) {
            for (int j = i+1; j < nums.length ; j++) {
                    if (nums[i] > nums[j]) {
                        subSeqLen[i] = Math.max(subSeqLen[i], subSeqLen[j] + 1);
                    }
            }
        }
        return subSeqLen;
    }

    public int minimumMountainRemovals(int[] nums) {
        int[] longIncArr = LongestIncreasingSubsequence(nums);
        int[] longDecArr = LongestDecreasingSubsequence(nums);
        int minRemovals = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (longIncArr[i] > 1 && longDecArr[i] > 1) {
                minRemovals = Math.min(
                        minRemovals,
                        nums.length - longIncArr[i] - longDecArr[i] + 1
                );
            }
        }
        return minRemovals;
    }

    public static void main(String[] args) {
        MinMountainRemovals minMountainRemovals = new MinMountainRemovals();
        System.out.println(minMountainRemovals.minimumMountainRemovals(new int[]{9,8,1,7,6,5,4,3,2,1}));
    }
}
