package year_2024.mar_2024;

public class Binary_Subarrays_With_Sum {

    public int numSubarraysWithSum(int[] nums, int goal) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if(sum == goal){
                    result++;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
      Binary_Subarrays_With_Sum binarySubarraysWithSum = new Binary_Subarrays_With_Sum();
      System.out.println(binarySubarraysWithSum.numSubarraysWithSum(new int[]{1,0,1,0,1},2));
    }
}
