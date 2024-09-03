package year_2024.sep_2024.sep_2;

public class ChalkReplacer {

    public int chalkReplacer(int[] chalk, int k) {
        long sumForCycle = 0;
        for (int i = 0; i < chalk.length; i++) {
            sumForCycle += chalk[i];
        }
        int remainderAfterCycle = (int) (k % sumForCycle);
        for (int i = 0; i < chalk.length; i++) {
            if(remainderAfterCycle<chalk[i]) {
                return i;
            }
            remainderAfterCycle-= chalk[i];
        }
        return 0;
    }

    public static void main(String[] args) {
        ChalkReplacer chalkReplacer = new ChalkReplacer();
        System.out.println(chalkReplacer.chalkReplacer(new int[]{5,1,5},22));
    }

}
