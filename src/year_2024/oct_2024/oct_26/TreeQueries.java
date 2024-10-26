package year_2024.oct_2024.oct_26;

import utility.TreeNode;

public class TreeQueries {

    public int[] treeQueries(TreeNode root, int[] queries) {
        int[] subTreeHeight = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            TreeNode temp = deepClone(root);
            replaceNode(temp,queries[i]);
            subTreeHeight[i] =  findHeight(temp) - 1;
        }
        return subTreeHeight;
    }

    private TreeNode deepClone(TreeNode root) {
        if (root==null)
            return null;
        TreeNode node = new TreeNode(root.val);
        node.left = deepClone(root.left);
        node.right = deepClone(root.right);
        return node;
    }

    private void replaceNode(TreeNode temp, int query) {
        if (temp==null)
            return;
        if (temp.left!=null && temp.left.val==query)
            temp.left = null;
        else
            replaceNode(temp.left,query);
        if (temp.right!=null && temp.right.val==query)
            temp.right = null;
        else
            replaceNode(temp.right,query);

    }

    private int findHeight(TreeNode root) {
        if(root == null)
            return 0;
        int left = findHeight(root.left);
        int right = findHeight(root.right);
        return Math.max(left,right)+1;
    }

    public static void main(String[] args) {
        TreeNode treeNode7 = new TreeNode(7);
        TreeNode treeNode5 = new TreeNode(5, treeNode7, null);
        TreeNode treeNode6 = new TreeNode(6);
        TreeNode treeNode4 = new TreeNode(4, treeNode6, treeNode5);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3, treeNode2, null);
        TreeNode root = new TreeNode(1,treeNode3,treeNode4);
        TreeQueries queries = new TreeQueries();
        System.out.println(queries.treeQueries(root, new int[]{4,3}));
    }
}
