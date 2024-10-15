package year_2024.oct_2024.oct_15;

public class MinimumSteps {

    public long minimumSteps(String s) {
        long minSteps = 0;
        int curCount = 0;
        for (int i = s.length()-1; i >= 0; i--) {
            if (s.charAt(i)=='0')
                curCount++;
            else
                minSteps+= curCount;
        }
        return minSteps;
    }

    public static void main(String[] args) {
        MinimumSteps minimumSteps = new MinimumSteps();
        System.out.println(minimumSteps.minimumSteps("0111"));
    }
}
