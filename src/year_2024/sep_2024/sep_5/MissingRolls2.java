package year_2024.sep_2024.sep_5;

import java.util.Arrays;

public class MissingRolls2 {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int nm = n+rolls.length;
        int availableSum = 0;
        for (int i = 0; i < rolls.length; i++) {
            availableSum += rolls[i];
        }
        int requiredSum = (mean * nm) - availableSum;
        double requireMean =(double) requiredSum/n;
        if (requireMean>6 || requireMean < 1){
            return new int[]{};
        }
        int[] result = new int[n];
        int i = 0;
        while (requiredSum!=0){
            if(requireMean % 1 == 0) {
                Arrays.fill(result,i,result.length,(int) requireMean);
                break;
            }else {
                int curr = (int) Math.ceil(requireMean);
                result[i++] = curr;
                requiredSum -= curr;
                n--;
                requireMean = (double) requiredSum / n;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        MissingRolls2 missingRolls = new MissingRolls2();
//        int [] res = missingRolls.missingRolls(new int[]{3,2,4,3},4,2);
        int [] res = missingRolls.missingRolls(new int[]{1,5,6},3,4);
//        int [] res = missingRolls.missingRolls(new int[]{1,3,2,4},6,4);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }
}
