package year_2024.aug_2024.aug_13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combination_Sum_II {

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> results = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(results,candidates, new ArrayList<Integer>(),target,0);
        return results;
    }

    private void backtrack(List<List<Integer>> results, int[] candidates, ArrayList<Integer> curr, int remaining, int start) {
        if (remaining<0)
            return;
        else if(remaining == 0)
            results.add(new ArrayList<>(curr));
        else
            for (int i = start; i < candidates.length; i++) {
                if (i>start&&candidates[i]==candidates[i-1])
                    continue;
                curr.add(candidates[i]);
                backtrack(results,candidates,curr,remaining-candidates[i],i+1);
                curr.remove(curr.size()-1);
            }
    }

    public static void main(String[] args) {
        Combination_Sum_II combinationSumIi = new Combination_Sum_II();
        System.out.println(combinationSumIi.combinationSum2(new int[]{10,1,2,7,6,1,5}, 8));
    }
}
