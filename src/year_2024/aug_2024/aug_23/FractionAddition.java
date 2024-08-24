package year_2024.aug_2024.aug_23;

import java.util.ArrayList;
import java.util.List;

public class FractionAddition {

    public String fractionAddition(String expression) {
        String[] nos= expression.split("\\+");
        List<String> finalNos = new ArrayList<>();
        for (int i = 0; i < nos.length; i++) {
            if (nos[i].length()>2){
                String[] tempNegative = nos[i].split("-");
                finalNos.add(tempNegative[0]);
                for (int j = 1; j < tempNegative.length; j++) {
                    finalNos.add("-"+tempNegative[j]);
                }
            }else {
                finalNos.add(nos[i]);
            }
        }
        String result = "0/1";
        for (String temp : finalNos) {
            if (result.contains("-") && temp.contains("-")){
                if (result.charAt(result.length()-1)==temp.charAt(temp.length()-1)){
                       
                }else {

                }
            } else if (result.contains("-") || temp.contains("-")) {
                if (result.charAt(result.length()-1)==temp.charAt(temp.length()-1)){

                }else {

                }
            }else {
                if (result.charAt(result.length()-1)==temp.charAt(temp.length()-1)){

                }else {

                }
            }
        }
        return  result;
    }
    public static void main(String[] args) {
        FractionAddition addition = new FractionAddition();
        System.out.println(addition.fractionAddition("1/2-1/2"));
    }
}
