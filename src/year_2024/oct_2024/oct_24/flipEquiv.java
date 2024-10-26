package year_2024.oct_2024.oct_24;

import utility.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class flipEquiv {

    public boolean flipEquiv(TreeNode root1, TreeNode root2) {
        Queue<TreeNode> treeNodes1 = new LinkedList<>();
        treeNodes1.add(root1);
        TreeNode temp;
        while (!treeNodes1.isEmpty()){
            int size = treeNodes1.size();
            temp = null;
            for (int i = 0; i < size; i++) {
                TreeNode curNode = treeNodes1.poll();
                if (curNode!=null){
                    treeNodes1.add(curNode.left);
                    treeNodes1.add(curNode.right);
                    temp = curNode.right;
                    curNode.right = curNode.left;
                    curNode.left = temp;
                }
            }
        }
        Queue<TreeNode> treeNodes2 = new LinkedList<>();
        treeNodes1.add(root1);
        treeNodes2.add(root2);
        while (!treeNodes1.isEmpty())
        {
            int size1 = treeNodes1.size();
            for (int i = 0; i < size1; i++) {
                TreeNode treeNode1 = treeNodes1.poll();
                TreeNode treeNode2 = treeNodes2.poll();
                if ((treeNode1.left!=treeNode2.left)||(treeNode1.right!=treeNode2.right))
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        flipEquiv equiv = new flipEquiv();
        TreeNode treeNode8 = new TreeNode(8);
        TreeNode treeNode7 = new TreeNode(7);
        TreeNode treeNode5 = new TreeNode(5,treeNode7,treeNode8);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode2 = new TreeNode(2,treeNode4,treeNode5);
        TreeNode treeNode6 = new TreeNode(6);
        TreeNode treeNode3 = new TreeNode(3,null, treeNode6);
//        TreeNode root1 = new TreeNode(1,treeNode2,treeNode3);
//        TreeNode root2 = new TreeNode(1,treeNode3,treeNode2);
        TreeNode root1 = new TreeNode();
        TreeNode root2 = new TreeNode();
        System.out.println(equiv.flipEquiv(root1,root2));
    }
}
