package year_2024.sep_2024.sep_27;

import java.util.List;

public class MyCalendarTwo {

    List<int[]> singleBookings;
    List<int[]> doubleBookings;

    public MyCalendarTwo() {

    }

    public boolean book(int start, int end) {
        return false;
    }

    public static void main(String[] args) {
        MyCalendarTwo obj = new MyCalendarTwo();
        boolean param_1 = obj.book(10,20);
        System.out.println(param_1);
        boolean param_2 = obj.book(50,60);
        System.out.println(param_2);
        boolean param_3 = obj.book(10,40);
        System.out.println(param_3);
        boolean param_4 = obj.book(5,15);
        System.out.println(param_4);
        boolean param_5 = obj.book(5,10);
        System.out.println(param_5);
        boolean param_6 = obj.book(25,55);
        System.out.println(param_6);
    }

}
