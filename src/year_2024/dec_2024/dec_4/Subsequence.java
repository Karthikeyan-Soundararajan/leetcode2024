package year_2024.dec_2024.dec_4;

public class Subsequence {
    public boolean canMakeSubsequence(String str1, String str2) {
        if (str2.length()>str1.length())
            return false;
        StringBuilder sb = new StringBuilder();
        int j =0;
        for (char ch : str1.toCharArray()){
            if(ch == str2.charAt(j) || str2.charAt(j)==(ch=='z'?'a':(char) (ch +1))){
                sb.append(str2.charAt(j));
                j++;
            }
            if (j==str2.length())
                break;
        }
        return str2.contentEquals(sb);
    }

    public static void main(String[] args) {
        Subsequence subsequence = new Subsequence();
        System.out.println(subsequence.canMakeSubsequence("ab","d"));
    }
}
