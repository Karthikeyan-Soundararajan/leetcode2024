package year_2024.sep_2024.sep_14;

public class LongestSubarray {

    public int longestSubarray(int[] nums) {
        int ans = 0,currentStreak=0, max_val=Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]>=max_val){
                if(max_val==nums[i]){
                    currentStreak++;
                }else {
                    ans = 0;
                    currentStreak = 1;
                }
                max_val = nums[i];
            }else {
                ans = Math.max(ans,currentStreak);
                currentStreak=0;
            }
        }
        return Math.max(ans,currentStreak);
    }

    public static void main(String[] args) {
        LongestSubarray longestSubarray = new LongestSubarray();
        System.out.println(longestSubarray.longestSubarray(new int[]{311155,311155,311155,311155,311155,311155,311155,311155,201191,311155}));
        System.out.println(longestSubarray.longestSubarray(new int[]{117793,117793,117793,117793,117793,117793,117793,117793,117793,117793,117793,117793,117793,117793,117793,117793,117793,117793,117793,117793,117793,117793,117793,117793,117793,117793,117793,117793,117793,117793,117793,117793,117793,117793,117793,117793,117793,117793,117793,117793,117793,117793,117793,117793,117793,117793,117793,117793,117793,117793,117793,117793,117793,117793,117793,117793,117793,117793,117793,117793,117793,117793,109282,109282,109282,109282,109282,109282,109282,109282,109282,109282,109282,109282,109282,169349}));
    }
}
