package year_2024.sep_2024.sep_26;

import java.util.TreeMap;

public class MyCalendar {

    TreeMap<Integer,Integer> treeMap;

    public MyCalendar() {
        treeMap = new TreeMap<>();
    }

    public boolean book(int start, int end) {
        Integer prev = treeMap.floorKey(start);
        Integer next = treeMap.ceilingKey(start);
        if ((prev==null || treeMap.get(prev) <= start) && (next==null || end<= next)){
            treeMap.put(start,end);
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
         MyCalendar obj = new MyCalendar();
        boolean param_1 = obj.book(47,50);
        System.out.println(param_1);
        boolean param_2 = obj.book(33,41);
        System.out.println(param_2);
        boolean param_3 = obj.book(30,40);
        System.out.println(param_3);
        boolean param_4 = obj.book(15,25);
        System.out.println(param_4);
    }
}
