package year_2024.sep_2024.sep_7;

import utility.ListNode;
import utility.TreeNode;

public class SubPath {

    public boolean isSubPath(ListNode head, TreeNode root) {
        return findPath(head,head,root);
    }

    private boolean findPath(ListNode head, ListNode curr, TreeNode root) {
        if (curr==null)
            return true;
        if (root == null)
            return false;
        if (root.val== curr.val)
            curr = curr.next;
        else if(root.val== head.val)
            head = head.next;
        else
            curr = head;
        return findPath(head,curr,root.left) || findPath(head,curr,root.right);
    }

    public static void main(String[] args) {
        ListNode node2 = new ListNode(8);
        ListNode node1 = new ListNode(2, node2);
        ListNode head = new ListNode(4,node1);
        TreeNode left2 = new TreeNode(1);;
        TreeNode right5 = new TreeNode(4);
        TreeNode right2 = new TreeNode(2, left2, right5);
        TreeNode left1 = new TreeNode(4,null,right2);
        TreeNode left4= new TreeNode(6);
        TreeNode left5 = new TreeNode(1);
        TreeNode right4=new TreeNode(3);
        TreeNode right3 = new TreeNode(8, left5, right4);
        TreeNode left3 = new TreeNode(2,left4,right3);
        TreeNode right1=new TreeNode(4, left3, null);
        TreeNode root = new TreeNode(1,left1, right1);
        SubPath subPath = new SubPath();
        System.out.println(subPath.isSubPath(head,root));
    }
}
