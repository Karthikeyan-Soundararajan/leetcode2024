package year_2024.aug_2024.aug_12;

import java.util.PriorityQueue;

public class KthLargest {

    int k;
    PriorityQueue<Integer> numbers;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        numbers = new PriorityQueue<>(k);
        for (int num : nums) {
            add(num);
        }
    }

    public int add(int val) {
        if (numbers.size()<k){
            numbers.add(val);
        } else if (val > numbers.peek() ) {
            numbers.poll();
            numbers.offer(val);
        }
        return numbers.peek();
    }

    public static void main(String[] args) {
        KthLargest kthLargest = new KthLargest(3,new int[]{4,5,8,2});
        System.out.println(kthLargest.add(3));
        System.out.println(kthLargest.add(5));
        System.out.println(kthLargest.add(10));
        System.out.println(kthLargest.add(9));
        System.out.println(kthLargest.add(4));
    }
}
