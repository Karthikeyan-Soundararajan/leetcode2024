package year_2024.sep_2024.sep_12;

public class CountConsistentStrings {

    public int countConsistentStrings(String allowed, String[] words) {
        int count=0;
        for (int i = 0; i < words.length; i++) {
            String curr = words[i];
            boolean isConsistent = true;
            for (int j = 0; j < curr.length(); j++) {
                if (allowed.indexOf(curr.charAt(j))==-1){
                    isConsistent = false;
                    break;
                }
            }
            if (isConsistent)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        CountConsistentStrings consistentStrings = new CountConsistentStrings();
        System.out.println(consistentStrings.countConsistentStrings("ab", new String[]{"ad","bd","aaab","baa","badab"}));
    }
}
