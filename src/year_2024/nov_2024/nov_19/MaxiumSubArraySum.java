package year_2024.nov_2024.nov_19;

import java.util.HashMap;
import java.util.Map;

public class MaxiumSubArraySum {

    public long maximumSubarraySum(int[] nums, int k) {
        Map<Integer,Integer> countMap = new HashMap<>();
        long maxSum = 0, currentSum = 0;
        for (int i = 0; i < k; i++) {
            currentSum += nums[i];
            countMap.put(nums[i],countMap.getOrDefault(nums[i],0)+1);
        }
        if (countMap.size()==k){
            maxSum = Math.max(currentSum,maxSum);
        }
        for (int i = k; i < nums.length; i++) {
            currentSum += nums[i];
            currentSum -= nums[i-k];
            if (countMap.get(nums[i-k])!=null){
                if (countMap.get(nums[i-k])==1){
                    countMap.remove(nums[i-k]);
                }else {
                    countMap.put(nums[i-k],countMap.get(nums[i-k])-1);
                }
            }
            countMap.put(nums[i],countMap.getOrDefault(nums[i],0)+1);
            if (countMap.size()==k){
                maxSum = Math.max(currentSum,maxSum);
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        MaxiumSubArraySum maxiumSubArraySum = new MaxiumSubArraySum();
//        System.out.println(
//                maxiumSubArraySum.maximumSubarraySum(new int[]{1,5,4,2,9,9,9}, 3)
//        );
//        System.out.println(
//                maxiumSubArraySum.maximumSubarraySum(new int[]{5,3,3,1,1}, 3)
//        );
//        System.out.println(
//                maxiumSubArraySum.maximumSubarraySum(new int[]{3,5,3,4}, 2)
//        );
//        System.out.println(
//                maxiumSubArraySum.maximumSubarraySum(new int[]{1,1,1,7,8,9}, 3)
//        );
//        System.out.println(
//                maxiumSubArraySum.maximumSubarraySum(new int[]{9,9,9,1,2,3}, 3)
//        );
        System.out.println(
                maxiumSubArraySum.maximumSubarraySum(new int[]{1,2,1,1,3}, 2)
        );
    }
}
