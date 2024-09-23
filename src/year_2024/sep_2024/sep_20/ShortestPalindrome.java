package year_2024.sep_2024.sep_20;

public class ShortestPalindrome {

    public String shortestPalindrome(String s) {
//        StringBuilder sb = new StringBuilder(s);
//        int outIndex = 0;
//        for (int i = s.length()-1; i >= 0; i--) {
//            if (s.charAt(i) != sb.charAt(outIndex)){
//                sb.insert(outIndex,s.charAt(i));
//            }
//            outIndex++;
//        }
//        return sb.toString();

        final String t = new StringBuilder(s).reverse().toString();

        // Iterate through the reversed string 't'
        for (int i = 0; i < t.length(); i++) {
            // Check if the original string 's' starts with the current suffix of 't'
            // The substring from index 'i' onwards is compared with the start of 's'
            if (s.startsWith(t.substring(i))) {
                // If a matching prefix-suffix is found, return the result by adding
                // the unmatched part of 't' to the front of 's' to form the palindrome
                return t.substring(0, i) + s;
            }
        }

        // If no matching prefix-suffix is found, the entire reversed string 't'
        // is added in front of 's' to form the shortest palindrome
        return t + s;
        
    }

    public static void main(String[] args) {
        ShortestPalindrome shortestPalindrome = new ShortestPalindrome();
//        System.out.println(shortestPalindrome.shortestPalindrome("aacecaaa"));
//        System.out.println(shortestPalindrome.shortestPalindrome("abcd"));
        System.out.println(shortestPalindrome.shortestPalindrome("adcba"));
    }
}
