package year_2024.sep_2024.sep_24;

import java.util.*;
import java.util.stream.IntStream;

public class LongestCommonPrefix {

    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        Set<Integer> prefixes = new HashSet<>();
//        arr1 = Arrays.stream(arr1).distinct().toArray();
//        arr2 = IntStream.of(arr2).boxed().distinct().sorted(Comparator.reverseOrder()).mapToInt(i->i).toArray();
        int result = 0;
        for (int i = 0; i < arr1.length; i++) {
            while (arr1[i]!=0){
                prefixes.add(arr1[i]);
                arr1[i] = arr1[i]/10;
            }
        }
        boolean isMatched = true;
//        int maxLen = 0;
        for (int i = 0; i < arr2.length; i++) {
            isMatched = true;
//            maxLen = String.valueOf(arr2[i]).length();
            while (isMatched && arr2[i]!=0){
                if (prefixes.contains(arr2[i])){
                    isMatched = false;
                    if (arr2[i]>result){
                        result = arr2[i];
                    }
//                    if (maxLen==String.valueOf(result).length()){
//                        break;
//                    }
                    continue;
                }
                arr2[i] = arr2[i] / 10;
            }
        }
        return result==0?0:String.valueOf(result).length();
    }

    public static void main(String[] args) {
        LongestCommonPrefix commonPrefix = new LongestCommonPrefix();
        System.out.println(commonPrefix.longestCommonPrefix(new int[]{1,3,2,3}, new int[]{1,3,2,3}));
//        System.out.println(commonPrefix.longestCommonPrefix(new int[]{34}, new int[]{39}));
    }
}
