package year_2024.sep_2024.sep_6;

import utility.ListNode;

import java.util.Arrays;
import java.util.List;

public class ModifiedList {

    public ListNode modifiedList(int[] nums, ListNode head) {
        List<Integer> numsList = Arrays.stream(nums).boxed().toList();
        ListNode result = null;
        ListNode curNode = null;
        while (head!=null){
            if (!numsList.contains(head.val)){
                if (result!=null){
                    if (curNode!=null){
                        curNode.next = new ListNode(head.val);
                        curNode = curNode.next;
                    }else {
                        ListNode listNode = new ListNode(head.val);
                        result.next = listNode;
                        curNode = result.next;
                    }
                }else {
                    result = new ListNode(head.val);
                }
            }
            head = head.next;
        }
        return result;
    }

    public static void main(String[] args) {
        ModifiedList modifiedList = new ModifiedList();
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
