package year_2024.sep_2024.sep_18;

import java.util.Arrays;
import java.util.stream.Collectors;

public class LargestNumber {
    public String largestNumber(int[] nums) {
        String out = Arrays.stream(nums).mapToObj(operand -> String.valueOf(operand)).sorted((o1, o2) -> {
            return (o2+o1).compareTo(o1+o2);
        }).collect(Collectors.joining());
        if (out.matches("[0]+$")){
            return "0";
        }else {
            return out;
        }
    }

    public static void main(String[] args) {
        LargestNumber largestNumber = new LargestNumber();
        System.out.println(largestNumber.largestNumber(new int[]{3,30,34,5,9}));
        System.out.println(largestNumber.largestNumber(new int[]{0,0}));
    }
}
