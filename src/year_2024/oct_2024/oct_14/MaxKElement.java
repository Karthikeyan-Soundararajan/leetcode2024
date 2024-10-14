package year_2024.oct_2024.oct_14;

import java.util.Collections;
import java.util.PriorityQueue;

public class MaxKElement {

    public long maxKelements(int[] nums, int k) {
        long sumOfMax = 0;
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < nums.length; i++) {
            priorityQueue.add(nums[i]);
        }
        while (k!=0)
        {
            int maxEle = priorityQueue.poll();
            sumOfMax += maxEle;
            priorityQueue.add((int) Math.ceil(maxEle / 3.0));
            k--;
        }
        return sumOfMax;
    }

    public static void main(String[] args) {
        MaxKElement maxKElement = new MaxKElement();
        System.out.println(maxKElement.maxKelements(new int[]{1,10,3,3,3},3));
    }
}
