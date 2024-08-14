package year_2024.aug_2024.aug_14;

import java.util.Arrays;

public class SmallestDistancePair {

    public int smallestDistancePair(int[] nums, int k) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums[nums.length-1]-nums[0];
        while (left<right){
            int mid = (left+right) /2;
            if (findsmallestpairs(nums,mid,k))
                right = mid;
            else
                left = mid+1;

        }
        return left;
    }

    private boolean findsmallestpairs(int[] nums, int mid, int k) {
        int count = 0, left = 0;
        for (int right = 1; right < nums.length; right++) {
            while (nums[right]-nums[left] > mid)
                left++;
            count+= right-left;

        }
        return count>=k;
    }

    public static void main(String[] args) {
        SmallestDistancePair smallestDistancePair = new SmallestDistancePair();
        System.out.println(smallestDistancePair.smallestDistancePair(new int[]{1,3,1},1));
    }
}
