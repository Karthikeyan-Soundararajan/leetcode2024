package year_2024.june_2024.june_26;

import utility.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Balance_BST {

    public TreeNode balanceBST(TreeNode root) {
        List<Integer> sortedElements = new ArrayList<>();
        inOrderTraversal(root,sortedElements);
        return buildBST(root,sortedElements,0,sortedElements.size()-1);
    }

    private TreeNode buildBST(TreeNode root, List<Integer> sortedElements,int start, int end) {
        if(start>end){
            return null;
        }
        int mid = start + (end-start) / 2;
        TreeNode treeNode = new TreeNode(sortedElements.get(mid));
        treeNode.left = buildBST(treeNode,sortedElements,start,mid-1);
        treeNode.right = buildBST(treeNode,sortedElements,mid+1,end);
        return treeNode;
    }

    private void inOrderTraversal(TreeNode root, List<Integer> sortedElements) {
        if(root == null){
            return;
        }
        inOrderTraversal(root.left,sortedElements);
        sortedElements.add(root.val);
        inOrderTraversal(root.right,sortedElements);
    }

    public static void main(String[] args) {
        Balance_BST balanceBst = new Balance_BST();
        TreeNode rootNode = new TreeNode(2);
        rootNode.left = new TreeNode(1);
        rootNode.right = new TreeNode(3);
        TreeNode outNode = balanceBst.balanceBST(rootNode);
        printNode(outNode);
    }

    private static void printNode(TreeNode outNode) {
        if(outNode == null){
            return;
        }
        System.out.print(outNode.val +" ");
        printNode(outNode.left);
        printNode(outNode.right);
    }
}
