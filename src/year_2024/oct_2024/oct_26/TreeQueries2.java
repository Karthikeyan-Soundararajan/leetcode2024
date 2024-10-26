package year_2024.oct_2024.oct_26;

import utility.TreeNode;

public class TreeQueries2 {

    public int[] treeQueries(TreeNode root, int[] queries) {
        int[] subTreeHeight = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            subTreeHeight[i] =  findHeight(root,queries[i]) - 1;
        }
        return subTreeHeight;
    }

    private int findHeight(TreeNode root, int query) {
        if(root == null)
            return 0;
        if (root.val == query)
            return 0;
        int left = findHeight(root.left, query);
        int right = findHeight(root.right, query);
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
        TreeQueries2 queries = new TreeQueries2();
        System.out.println(queries.treeQueries(root, new int[]{4,3}));
    }
}
