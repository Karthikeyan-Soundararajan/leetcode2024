package year_2024.nov_2024.nov_10;

import java.util.Arrays;

public class MinSubArrayLength {

    public int minimumSubarrayLength(int[] nums, int k) {
        if (Arrays.stream(nums).anyMatch(value -> value>=k)){
            return 1;
        }else {
            int[] bitOR = new int[nums.length];
            bitOR[0] = nums[0];
            for (int i = 1; i < nums.length; i++) {
                bitOR[i] = nums[i]|bitOR[i-1];
            }
            int minLen = Integer.MAX_VALUE;
            for (int i = 0; i < bitOR.length; i++) {
                if (bitOR[i]>= k){
                    int temp = bitOR[i];
                    int tempLen = 0;
                    for (int j = 0;  temp < k; j++) {
                        temp |= nums[j];
                        tempLen++;
                    }
                    minLen = Math.min(minLen,tempLen);
                }
            }
            return  minLen == Integer.MAX_VALUE ? -1 : minLen;
        }
    }

    public static void main(String[] args) {
        MinSubArrayLength minSubArrayLength = new MinSubArrayLength();
        System.out.println(minSubArrayLength.minimumSubarrayLength(new int[]{2,1,6,32,86,56},805306369));

    }
}
