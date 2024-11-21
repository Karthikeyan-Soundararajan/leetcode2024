package year_2024.nov_2024.nov_20;

public class TakeCharacters {

    public int takeCharacters(String s, int k) {
        int[] charFreq = new int[3];
        for (int i = 0; i < s.length(); i++) {
            charFreq[s.charAt(i)-'a']++;
        }
        for (int i = 0; i < charFreq.length; i++) {
            if (charFreq[i]<k){
                return -1;
            }
        }
        int[] currWindowFreq = new int[3];
        int left = 0, maxWindow = 0;
        for (int right = 0; right < s.length(); right++) {
            currWindowFreq[s.charAt(right)-'a']++;
            while (left<=right && (charFreq[0]-currWindowFreq[0]<k || charFreq[1]-currWindowFreq[1]<k || charFreq[2]-currWindowFreq[2]<k)){
                currWindowFreq[s.charAt(left)-'a']--;
                left++;
            }
            maxWindow = Math.max(maxWindow, right-left+1);
        }
        return s.length()-maxWindow;
    }

    public static void main(String[] args) {
        TakeCharacters takeCharacters = new TakeCharacters();
        System.out.println(takeCharacters.takeCharacters("aabaaaacaabc",2));
        System.out.println(takeCharacters.takeCharacters("a",1));
    }
}
