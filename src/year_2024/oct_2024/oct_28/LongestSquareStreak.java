package year_2024.oct_2024.oct_28;

import java.util.HashSet;
import java.util.List;
import java.util.stream.IntStream;

public class LongestSquareStreak {

    public int longestSquareStreak(int[] nums) {
        int longestStreak = -1;
        List<Integer> list = IntStream.of(nums).boxed().sorted().toList();
        HashSet<Integer> visitedValues = new HashSet<>();
        for (int i = 0; i < list.size(); i++) {
            int temp = list.get(i);
            int tempStreak = 0;
            if (!visitedValues.contains(temp)){
                while (list.contains(temp)&&tempStreak<=5){
                    tempStreak++;
                    visitedValues.add(temp);
                    temp = temp*temp;
                }
            }
            if (tempStreak > longestStreak)
                longestStreak = tempStreak;
            if (longestStreak==5){
                break;
            }
        }
        return longestStreak>1?longestStreak:-1;
    }

    public static void main(String[] args) {
        LongestSquareStreak squareStreak = new LongestSquareStreak();
        System.out.println(squareStreak.longestSquareStreak(new int[]{2,3,5,6,7}));
    }
}
