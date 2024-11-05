package year_2024.nov_2024.nov_5;

public class MinimumChanges {

    public int minChanges(String s) {
        int minChange = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c!=s.charAt(++i)){
                minChange++;
            }
        }
        return minChange;
    }

    public static void main(String[] args) {
        MinimumChanges minimumChanges = new MinimumChanges();
        System.out.println(minimumChanges.minChanges("0000"));
    }
}
