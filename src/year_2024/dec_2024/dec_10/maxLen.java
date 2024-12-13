package year_2024.dec_2024.dec_10;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class maxLen {

    public int maximumLength(String s) {
        Map<String, Integer> countMap = new HashMap<>();
        for (int i = s.length()-2; i >0; i--) {
            for (int j = 0; j <= s.length() -i; j++) {
                String subStr = s.substring(j,j+i);
                if (subStr.chars().distinct().count() == 1)
                    countMap.put(subStr,countMap.getOrDefault(subStr,0)+1);
            }
            Optional<Map.Entry<String, Integer>> max = countMap.entrySet().stream().filter(stringIntegerEntry -> stringIntegerEntry.getValue()>=3).findFirst();
            if (max.isPresent())
                return max.get().getKey().length();
        }
        return -1;
    }

    public static void main(String[] args) {
        maxLen len = new maxLen();
        System.out.println(len.maximumLength("cccerrrecdcdccedecdcccddeeeddcdcddedccdceeedccecde"));
    }
}
