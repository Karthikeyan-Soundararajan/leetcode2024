package year_2024.oct_2024.oct_24;

import utility.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class InvertTree {

    public TreeNode invertTree(TreeNode root) {
        Queue<TreeNode> treeNodes = new LinkedList<>();
        treeNodes.add(root);
        TreeNode temp;
        while (!treeNodes.isEmpty()){
            int size = treeNodes.size();
            temp = null;
            for (int i = 0; i < size; i++) {
                TreeNode curNode = treeNodes.poll();
                if (curNode!=null){
                    treeNodes.add(curNode.left);
                    treeNodes.add(curNode.right);
                    temp = curNode.right;
                    curNode.right = curNode.left;
                    curNode.left = temp;
                }
            }
        }
        return root;
    }

    public static void main(String[] args) {
        TreeNode treeNode2 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(1);
        TreeNode treeNode5 = new TreeNode(2,treeNode4,treeNode2);
        TreeNode treeNode7 = new TreeNode(9);
        TreeNode treeNode6 = new TreeNode(6);
        TreeNode treeNode8 = new TreeNode(7,treeNode6,treeNode7);
        TreeNode rootNode = new TreeNode(4,treeNode5,treeNode8);
//        TreeNode treeNode2 = new TreeNode(2);
//        TreeNode rootNode = new TreeNode(1,null,treeNode2);
        InvertTree invertTree = new InvertTree();
        System.out.println(invertTree.invertTree(rootNode));
    }
}
