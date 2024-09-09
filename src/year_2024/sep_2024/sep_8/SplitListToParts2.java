package year_2024.sep_2024.sep_8;

import utility.ListNode;

public class SplitListToParts2 {

    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] results = new ListNode[k];
        ListNode dummyHead = head;
        int count = 0;
        while (dummyHead!=null){
            count++;
            dummyHead = dummyHead.next;
        }
        int mean = count / k;
        int extra = count % k;
        int nodeSize = 0;
        ListNode node = head, curr = node;
        for (int i = 0; i < results.length; i++) {
            if (i<extra){
                nodeSize = mean+1;
            }else if (count > 0){
                nodeSize = mean;
            }
            ListNode newPart = curr;
            while (nodeSize!=0){
                curr = curr.next;
                head = head.next;
                nodeSize--;
                count--;
            }
            if (curr!=null){
                node.next = null;
            }
            results[i] = node;
        }
        return results;
    }

    public static void main(String[] args) {
        SplitListToParts2 listToParts = new SplitListToParts2();
        ListNode next7 = new ListNode(8);
        ListNode next6 = new ListNode(7, next7);
        ListNode next5 = new ListNode(6, next6);
        ListNode next4 = new ListNode(5, next5);
        ListNode next3 = new ListNode(4, next4);
        ListNode next2 = new ListNode(3, next3);
        ListNode next1 = new ListNode(2, next2);
        ListNode head = new ListNode(1, next1);
        ListNode[] results = listToParts.splitListToParts(head,3);
        for (int i = 0; i < results.length; i++) {
            ListNode result = results[i];
            while (result!=null){
                System.out.print(result.val+" ");
                result = result.next;
            }
            System.out.println();
        }
    }
}
