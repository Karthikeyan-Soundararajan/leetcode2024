package year_2024.aug_2024.aug_15;

import java.util.HashMap;
import java.util.Map;

public class lemonadeChange {
    public boolean lemonadeChange(int[] bills) {
        boolean isDone = true;
        Map<Integer,Integer> changeMap = new HashMap<>();
        for (int i = 0; i < bills.length; i++) {
            changeMap.put(bills[i],changeMap.getOrDefault(bills[i],0)+1);
            if (bills[i]>5){
                if (bills[i]==10){
                    if(changeMap.getOrDefault(5,0)>0){
                        changeMap.put(5,changeMap.get(5)-1);
                    }else {
                        isDone = false;
                        break;
                    }
                }else {
                    if(changeMap.getOrDefault(10,0)>0){
                        changeMap.put(10,changeMap.get(10)-1);
                        if(changeMap.getOrDefault(5,0)>0){
                            changeMap.put(5,changeMap.get(5)-1);
                        }else {
                            isDone = false;
                            break;
                        }
                    }else if(changeMap.getOrDefault(5,0)>2){
                        changeMap.put(5,changeMap.get(5)-3);
                    }else {
                        isDone = false;
                        break;
                    }
                }
            }
        }
        return isDone;
    }

    public static void main(String[] args) {
        lemonadeChange change = new lemonadeChange();
        System.out.println(change.lemonadeChange(new int[]{10,10}));
    }
}
