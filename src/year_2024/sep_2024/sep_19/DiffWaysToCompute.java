package year_2024.sep_2024.sep_19;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DiffWaysToCompute {

    Map<String, List<Integer>> resultMap = new HashMap<>();
    public List<Integer> diffWaysToCompute(String expression) {
        if (resultMap.containsKey(expression)){
            return resultMap.get(expression);
        }
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);
            if (ch=='+'||ch=='-'||ch=='*'){
                List<Integer> left = diffWaysToCompute(expression.substring(0,i));
                List<Integer> right = diffWaysToCompute(expression.substring(i+1));
                for (int l : left){
                    for (int r: right){
                        if (ch=='+'){
                            result.add(l+r);
                        }else if (ch=='-'){
                            result.add(l-r);
                        } else if (ch=='*') {
                            result.add(l*r);
                        }
                    }
                }
            }
        }
        if (result.isEmpty())
            result.add(Integer.parseInt(expression));
        resultMap.put(expression,result);
        return result;
    }

    public static void main(String[] args) {
        DiffWaysToCompute waysToCompute = new DiffWaysToCompute();
        System.out.println(waysToCompute.diffWaysToCompute("2-1-1"));
    }
}
