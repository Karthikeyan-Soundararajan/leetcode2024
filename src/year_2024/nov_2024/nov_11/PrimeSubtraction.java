package year_2024.nov_2024.nov_11;

import java.util.ArrayList;
import java.util.List;

public class PrimeSubtraction {

    List<Integer> primeNumbers;

    public boolean primeSubOperation(int[] nums) {
        primeNumbers = generatePrime();
        for (int i = nums.length-2; i > 0; i--) {
            if (nums[i] > nums[i+1]){
                do {
                    int prime = findLowerPrime(nums[i]);
                    nums[i] -= prime;
                }while (nums[i]>nums[i+1]);
            }
        }
        return true;
    }

    private int findLowerPrime(int num) {
        int start = 0, end = primeNumbers.size();
        while (true){
            int mid = (start + end) / 2;
            if (num < primeNumbers.get(mid)){
                end = mid;
            }else if (num > primeNumbers.get(mid)){
                start = mid;
            }
            if (end-start == 1){
                if (num<primeNumbers.get(end)){
                   return primeNumbers.get(start);
                }else {
                    return primeNumbers.get(end);
                }
            }
        }
    }

    private List<Integer> generatePrime() {
        List<Integer> primeNumbers = new ArrayList<>();
        primeNumbers.add(1);
        primeNumbers.add(2);
        primeNumbers.add(3);
        primeNumbers.add(5);
        primeNumbers.add(7);
        primeNumbers.add(11);
        primeNumbers.add(13);
        primeNumbers.add(17);
        primeNumbers.add(19);
        primeNumbers.add(23);
        primeNumbers.add(29);
        primeNumbers.add(31);
        for (int i = 0; i < 1001; i++) {
            if (i%2!=0 && i%3!=0 && i%5!=0 && i%7 !=0 && i%11!=0 && i%13!=0 && i%17!=0 && i%19!=0 && i%23!=0
                && i%29!=0 && i%31!=0){
                primeNumbers.add(i);
            }
        }
        return primeNumbers;
    }

    public static void main(String[] args) {
        PrimeSubtraction primeSubtraction = new PrimeSubtraction();
        System.out.println(primeSubtraction.primeSubOperation(new int[]{4,9,6,10}));
    }
}
