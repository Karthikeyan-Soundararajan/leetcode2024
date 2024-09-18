package year_2024.sep_2024.sep_17;

import java.util.Arrays;
import java.util.stream.Collectors;

public class UncommonFromSentences {

    public String[] uncommonFromSentences(String s1, String s2) {
        s1 = s1+" "+s2;
        return Arrays.stream(s1.split(" ")).collect(Collectors.groupingBy(s -> s, Collectors.counting())).entrySet().stream().filter(stringLongEntry -> stringLongEntry.getValue()==1).map(stringLongEntry -> stringLongEntry.getKey()).toArray(String[]::new);
    }
    public static void main(String[] args) {
        UncommonFromSentences uncommonFromSentences = new UncommonFromSentences();
        System.out.println(Arrays.toString(uncommonFromSentences.uncommonFromSentences("this apple is sweet","this apple is sour")));
    }
}
