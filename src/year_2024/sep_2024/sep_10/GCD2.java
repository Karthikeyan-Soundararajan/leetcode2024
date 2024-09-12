package year_2024.sep_2024.sep_10;

import utility.ListNode;

public class GCD2 {

    public ListNode insertGreatestCommonDivisors(ListNode head) {

        if(head==null || head.next==null) return head;
        ListNode dummyHead = head;
        while (dummyHead.next!=null){
            ListNode nextNode = dummyHead.next;
            int gcd = findGCD(dummyHead.val, dummyHead.next.val);
            dummyHead.next = new ListNode(gcd);
            dummyHead = dummyHead.next;
            dummyHead.next = nextNode;
            dummyHead = dummyHead.next;
        }
        return head;
    }

    private int findGCD(int val, int val1) {
        int gcd = 0;
        for (int i = 1; i <=val && i <= val1 ; i++) {
            if (val%i==0&val1%i==0){
                gcd = i;
            }
        }
        return gcd;
    }

    public static void main(String[] args) {
//        ListNode next7 = new ListNode(8);
//        ListNode next6 = new ListNode(7, next7);
//        ListNode next5 = new ListNode(6, next6);
//        ListNode next4 = new ListNode(5, next5);
        ListNode next3 = new ListNode(3);
        ListNode next2 = new ListNode(10, next3);
        ListNode next1 = new ListNode(6, next2);
        ListNode head = new ListNode(18, next1);
        GCD2 gcd = new GCD2();
        ListNode results = gcd.insertGreatestCommonDivisors(head);
        while (results!=null){
            System.out.print(results.val+" ");
            results = results.next;
        }
    }
}
