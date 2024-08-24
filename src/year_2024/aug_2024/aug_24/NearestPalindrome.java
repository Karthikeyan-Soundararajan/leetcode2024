package year_2024.aug_2024.aug_24;

public class NearestPalindrome {

    public String nearestPalindromic(String n) {
        if (Long.valueOf(n)<10)
            return String.valueOf(Long.valueOf(n)-1);
        if (Long.valueOf(n)==11)
            return String.valueOf(9);
        long leftHalf = Long.valueOf(n.substring(0, (n.length()+1)/2));
        int length = n.length();
        long[] candidates = new long[5];
        candidates[0] = generatePalindrome(leftHalf,length%2==0);
        candidates[1] = generatePalindrome(leftHalf+1,length%2==0);
        candidates[2] = generatePalindrome(leftHalf-1,length%2==0);
        candidates[3] = (long) Math.pow(10,n.length()-1) -1;
        candidates[4] = (long) Math.pow(10,n.length()) +1;
        long nearestPalindrome = 0;
        long dif = Long.MAX_VALUE;
        long number = Long.valueOf(n);
        for (int i = 0; i < candidates.length; i++) {
            if (candidates[i] != number) {
                long curDif = Math.abs(number - candidates[i]);
                if (curDif < dif || (curDif == dif & candidates[i] < nearestPalindrome)) {
                    nearestPalindrome = candidates[i];
                    dif = curDif;
                }
            }
        }
        return String.valueOf(nearestPalindrome);
    }

    private long generatePalindrome(long leftHalf, boolean isEven) {
        long palindrome = leftHalf;
        if (!isEven){
            leftHalf = leftHalf /10;
        }
        while (leftHalf>0){
            palindrome = palindrome * 10 + leftHalf %10;
            leftHalf = leftHalf / 10;
        }
        return palindrome;
    }

    public static void main(String[] args) {
        NearestPalindrome nearestPalindrome = new NearestPalindrome();
        System.out.println(nearestPalindrome.nearestPalindromic("807045053224792883"));
    }
}
