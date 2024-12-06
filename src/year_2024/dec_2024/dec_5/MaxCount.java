package year_2024.dec_2024.dec_5;

import java.util.HashSet;
import java.util.Set;

public class MaxCount {

    public int maxCount(int[] banned, int n, int maxSum) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < banned.length; i++) {
            set.add(banned[i]);
        }
        int maxLen = 0;
        int curSum = 0;
        for (int i = 1; i <= n; i++) {
            if (!set.contains(i)){
                curSum += i;
                if (curSum<=maxSum)
                    maxLen++;
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        MaxCount maxCount = new MaxCount();
        System.out.println(maxCount.maxCount(new int[]{11},7,50));
    }
}
