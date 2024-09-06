package year_2024.sep_2024.sep_6;

import utility.ListNode;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class ModifiedList2 {

    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> toBeDel = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        ListNode node1 = new ListNode();
        node1.next = head;
        ListNode node2 = node1, node3 = node1;
        while (node2 != null){
            if (toBeDel.contains(node2.val)){
                node3.next = node2.next;
            }else {
                node3 = node2;
            }
            node2 = node2.next;
        }
        return node1.next;
    }

    public static void main(String[] args) {
        ModifiedList2 modifiedList = new ModifiedList2();
        ListNode next7 = new ListNode(6);
        ListNode next6 = new ListNode(1, next7);
        ListNode next5 = new ListNode(5, next6);
        ListNode next4 = new ListNode(4, next5);
        ListNode next3 = new ListNode(1, next4);
        ListNode next2 = new ListNode(3, next3);
        ListNode next1 = new ListNode(2, next2);
        ListNode head = new ListNode(1, next1);
        ListNode result = modifiedList.modifiedList(new int[]{1,2,7}, head);
        while (result!= null){
            System.out.println(result.val);
            result = result.next;
        }
    }
}
