package year_2024.sep_2024.sep_23;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MinExtraChar {

    public int minExtraChar(String s, String[] dictionary) {
        List<String> wordSet = Arrays.stream(dictionary).distinct().sorted((o1, o2) -> {
            if (o1.length() > o2.length()) {
                return -1;
            } else if (o1.length()<o2.length()) {
                return 1;
            }
            return 0;
        }).collect(Collectors.toList());
        System.out.println(wordSet);
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < wordSet.size(); i++) {
            while (sb.indexOf(wordSet.get(i)) > -1){
                sb = new StringBuilder(sb.substring(0,sb.indexOf(wordSet.get(i)))+sb.substring(sb.indexOf(wordSet.get(i))+wordSet.get(i).length(),sb.length()));
            }
        }
        return sb.length();
    }

    public static void main(String[] args) {
        MinExtraChar extraChar = new MinExtraChar();
        System.out.println(extraChar.minExtraChar("azvzulhlwxwobowijiyebeaskecvtjqwkmaqnvnaomaqnvf", new String[]{"na","i","edd","wobow","kecv","b","n","or","jj","zul","vk","yeb","qnfac","azv","grtjba","yswmjn","xowio","u","xi","pcmatm","maqnv"}));
//        System.out.println(extraChar.minExtraChar("leetscode", new String[]{"leet","leet","code","leetcode"}));
//        System.out.println(extraChar.minExtraChar("leetscode", new String[]{"ts","leetcode"}));
    }
}
