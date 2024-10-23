package year_2024.oct_2024.oct_22;

import utility.TreeNode;

import java.util.*;

public class KthLargestLevelSum {

    public long kthLargestLevelSum(TreeNode root, int k) {
        Queue<TreeNode> bfsQueue = new LinkedList<>();
        PriorityQueue<Long> levelSum = new PriorityQueue<>(Collections.reverseOrder());
        bfsQueue.add(root);
        long sum = 0;
        while (!bfsQueue.isEmpty()){
            sum = 0;
            int size = bfsQueue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = bfsQueue.poll();
                sum += node.val;
                if (node.left!=null)
                    bfsQueue.add(node.left);
                if (node.right!=null)
                    bfsQueue.add(node.right);
            }
            levelSum.add(sum);
        }
        if (levelSum.size()<k)
            return -1;
        for (int i = 0; i < k-1; i++) {
            levelSum.poll();
        }
        return levelSum.peek();
    }

    public static void main(String[] args) {
        KthLargestLevelSum largestLevelSum = new KthLargestLevelSum();
        TreeNode treeNode1 = new TreeNode(6);
        TreeNode treeNode2 = new TreeNode(4);
        TreeNode treeNode3 = new TreeNode(2,treeNode1,treeNode2);
        TreeNode treeNode4 = new TreeNode(1);
        TreeNode treeNode5 = new TreeNode(8,treeNode3,treeNode4);
        TreeNode treeNode6 = new TreeNode(3);
        TreeNode treeNode7 = new TreeNode(7);
        TreeNode treeNode8 = new TreeNode(9,treeNode6,treeNode7);
        TreeNode rootNode = new TreeNode(5,treeNode5,treeNode8);
        System.out.println(largestLevelSum.kthLargestLevelSum(rootNode,2));
    }
}
