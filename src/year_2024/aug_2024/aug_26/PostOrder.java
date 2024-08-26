package year_2024.aug_2024.aug_26;

import utility.Node;

import java.util.ArrayList;
import java.util.List;

public class PostOrder {

    public List<Integer> postorder(Node root) {
        List<Integer> results = new ArrayList<>();
        if (root != null) {
            for (Node child : root.children) {
                if (child != null) {
                    results.addAll(postorder(child));
                }
            }
            results.add(root.val);
        }
        return results;
    }

    public static void main(String[] args) {
        PostOrder postOrder = new PostOrder();
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        List<Node> node3Childs = new ArrayList<>();
        node3Childs.add(node5);
        node3Childs.add(node6);
        Node node3 = new Node(3, node3Childs);
        Node node2 = new Node(2);
        Node node4 = new Node(4);
        List<Node> rootChilds = new ArrayList<>();
        rootChilds.add(null);
        rootChilds.add(node3);
        rootChilds.add(null);
        rootChilds.add(node2);
        rootChilds.add(node4);
        Node root = new Node(1,rootChilds);
//        System.out.println(postOrder.postorder(root));
        System.out.println(postOrder.postorder(new Node()));
    }
}
