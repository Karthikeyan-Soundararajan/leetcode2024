package year_2024.aug_2024.aug_25;

import utility.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class PostOrderTraversal {

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> results = new ArrayList<>();
        if (root != null){
            results.addAll(postorderTraversal(root.left));
            results.addAll(postorderTraversal(root.right));
            results.add(root.val);
        }
        return results;
    }

    public static void main(String[] args) {
        PostOrderTraversal postOrderTraversal = new PostOrderTraversal();
        TreeNode root = new TreeNode();
        System.out.println(postOrderTraversal.postorderTraversal(root));
    }
}
