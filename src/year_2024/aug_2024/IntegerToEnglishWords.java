package year_2024.aug_2024;

import java.util.*;

public class IntegerToEnglishWords {

    Map<Integer, String> wordsmap =  new HashMap<>() {{
        put(0, "Zero");
        put(1, "One");
        put(2, "Two");
        put(3, "Three");
        put(4, "Four");
        put(5, "Five");
        put(6, "Six");
        put(7, "Seven");
        put(8, "Eight");
        put(9, "Nine");
        put(10, "Ten");
        put(11, "Eleven");
        put(12, "Twelve");
        put(13, "Thirteen");
        put(14, "Fourteen");
        put(15, "Fifteen");
        put(16, "Sixteen");
        put(17, "Seventeen");
        put(18, "Eighteen");
        put(19, "Nineteen");
        put(20, "Twenty");
        put(30, "Thirty");
        put(40, "Forty");
        put(50, "Fifty");
        put(60, "Sixty");
        put(70, "Seventy");
        put(80, "Eighty");
        put(90, "Ninety");
        put(100, "Hundred");
        put(1000, "Thousand");
        put(1000000, "Million");
        put(1000000000, "Billion");
    }};

    public String numberToWords(int num) {
        List<Integer> chunks = new ArrayList<>();
        while (num>0){
            chunks.add(num%1000);
            num = num / 1000;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = chunks.size(); i >= 0; i--) {
            stringBuilder.append(getEquivalentEnglishWords(chunks.indexOf(i)));
            if(i==4)
                stringBuilder.append(" Billion");
            if(i==3)
                stringBuilder.append(" Million");
            if(i==2)
                stringBuilder.append(" Thousand");
        }
        return stringBuilder.toString();
    }

    private String getEquivalentEnglishWords(int letter) {
        StringBuilder stringBuilder = new StringBuilder();
        if (letter<21){
            stringBuilder.append(wordsmap.get(letter));
        }else {
            if (letter<100){
                stringBuilder.append(wordsmap.get((letter/10)*10));
                if (letter%10 != 0)
                    stringBuilder.append(wordsmap.get((letter%10)));
            }else {
                stringBuilder.append(wordsmap.get((letter/100)*100));
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
     IntegerToEnglishWords integerToEnglishWords = new IntegerToEnglishWords();
     System.out.println(integerToEnglishWords.numberToWords(123));
    }
}
