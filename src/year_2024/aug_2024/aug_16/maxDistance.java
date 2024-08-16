package year_2024.aug_2024.aug_16;

import java.util.ArrayList;
import java.util.List;

public class maxDistance {

    public int maxDistance(List<List<Integer>> arrays) {
        int min = arrays.get(0).get(0), max =arrays.get(0).get(arrays.get(0).size()-1), maxDif = 0;
        for (int i = 1; i < arrays.size(); i++) {
            maxDif = Math.max(maxDif, Math.abs(arrays.get(i).get(arrays.get(i).size()-1)-min));
            maxDif = Math.max(maxDif, Math.abs(max-arrays.get(i).get(0)));
                min = Math.min(min,arrays.get(i).get(0));
                max = Math.max(max,arrays.get(i).get(arrays.get(i).size()-1));
        }
        return maxDif;
    }

    public static void main(String[] args) {
        maxDistance distance = new maxDistance();
        List<List<Integer>> numList = new ArrayList<>();
        List<Integer> numList1 = new ArrayList<>(){
            {
                add(1);
                add(2);
                add(3);
            }
        };
        List<Integer> numList2 = new ArrayList<>(){
            {
                add(4);
                add(5);
            }
        };
        numList.add(numList1);
        numList.add(numList2);
        numList.add(numList1);
        System.out.println(distance.maxDistance(numList));
    }
}
