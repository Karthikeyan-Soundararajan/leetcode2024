package year_2024.nov_2024.nov_15;

import java.util.ArrayList;
import java.util.List;

public class MinLenNonDecreasing {

    public int findLengthOfShortestSubarray(int[] arr) {
        List<Integer> prefix = new ArrayList<>();
        List<Integer> suffix = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if ((i+1) == arr.length){
                prefix.add(arr[i]);
            }else if(arr[i]<=arr[i+1]){
                prefix.add(arr[i]);
            }else {
                break;
            }
        }
        if (prefix.size()==arr.length)
            return 0;
        suffix.add(arr[arr.length-1]);
        if (prefix.size()==0)
            prefix.add(arr[0]);
        int prefixLastDigit = prefix.getLast();
        for (int i = arr.length-2; i >=0 ; i--) {
            if ((i-1) == -1){
                suffix.add(arr[i]);
            }else if(arr[i]<=arr[i+1] && arr[i] >= prefixLastDigit){
                suffix.add(arr[i]);
            }else {
                break;
            }
        }
        int count = arr.length - (prefix.size()+suffix.size());
        return count<1?1:count;
    }

    public static void main(String[] args) {
        MinLenNonDecreasing minLenNonDecreasing = new MinLenNonDecreasing();
        System.out.println(minLenNonDecreasing.findLengthOfShortestSubarray(new int[]{1,2,3,10,4,2,3,5}));
        System.out.println(minLenNonDecreasing.findLengthOfShortestSubarray(new int[]{5,4,3,2,1}));
        System.out.println(minLenNonDecreasing.findLengthOfShortestSubarray(new int[]{1,2,3}));
        System.out.println(minLenNonDecreasing.findLengthOfShortestSubarray(new int[]{13,0,14,7,18,18,18,16,8,15,20}));
        System.out.println(minLenNonDecreasing.findLengthOfShortestSubarray(new int[]{2,1}));
        System.out.println(minLenNonDecreasing.findLengthOfShortestSubarray(new int[]{6,3,10,11,15,20,13,3,18,12}));
    }
}
