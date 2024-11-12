package year_2024.nov_2024.nov_8;

import java.util.Arrays;

public class MaximumXOR {

    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int k = (int) (Math.pow(2,maximumBit) -1);
        int[] output = new int[nums.length];
        int invertedK=0;
        for (int i = 0; i < nums.length; i++) {
            invertedK ^= nums[i];
        }
        k ^= invertedK;
        output[output.length-1] = k;
        output[output.length-2] = output[output.length-1]^nums[output.length-2]^nums[output.length-1];
        for (int i = output.length-3; i >=0 ; i--) {
            output[i] = output[i+1]^nums[i+1];
        }
        return output;
    }

    public static void main(String[] args) {
        MaximumXOR maximumXOR = new MaximumXOR();
        System.out.println(Arrays.toString(maximumXOR.getMaximumXor(new int[]{2,3,4,7},3)));
    }
}
