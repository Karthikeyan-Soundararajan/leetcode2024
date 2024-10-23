package year_2024.oct_2024.oct_23;

import utility.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CousinsBinaryTree {

    public TreeNode replaceValueInTree(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int sum;
        List<Integer> levelSum = new ArrayList<>();
        while (!queue.isEmpty()){
            sum=0;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode curNode = queue.poll();
                sum += curNode.val;
                if (curNode.left!=null){
                    queue.add(curNode.left);
                }
                if (curNode.right!=null){
                    queue.add(curNode.right);
                }
            }
            levelSum.add(sum);
        }
        queue.add(root);
        root.val=0;
        int levelIndex = 1;
        while (!queue.isEmpty()){
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode curNode = queue.poll();
                int curNodeChildsSum = (curNode.left!=null ? curNode.left.val : 0) + (curNode.right!=null ? curNode.right.val : 0);
                if (curNode.left!=null){
                    //Calculating replace able sum by subtracting cur node child sum from  level sum
                    curNode.left.val = levelSum.get(levelIndex) - curNodeChildsSum;
                    queue.add(curNode.left);
                }
                if (curNode.right!=null){
                    curNode.right.val = levelSum.get(levelIndex) - curNodeChildsSum;
                    queue.add(curNode.right);
                }
            }
            levelIndex++;
        }
        return root;
    }

    public static void main(String[] args) {
        TreeNode treeNode2 = new TreeNode(10);
        TreeNode treeNode4 = new TreeNode(1);
        TreeNode treeNode5 = new TreeNode(4,treeNode4,treeNode2);
        TreeNode treeNode7 = new TreeNode(7);
        TreeNode treeNode8 = new TreeNode(9,null,treeNode7);
        TreeNode rootNode = new TreeNode(5,treeNode5,treeNode8);
        CousinsBinaryTree cousinsBinaryTree = new CousinsBinaryTree();
        System.out.println(cousinsBinaryTree.replaceValueInTree(rootNode));
    }
}
