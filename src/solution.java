import java.util.ArrayList;
import java.util.List;

public class solution {
    static class Node {
        Node left;
        Node righjt;
        int val;

        public Node(int val) {
            this.val = val;
        }

    }

    List<Integer> list = new ArrayList();

    public static void main(String[] args) {
        Node root = new Node(4);
        Node node1 = new Node(6);
        Node node2 = new Node(7);
        Node node3 = new Node(1);
        Node node4 = new Node(9);
        Node node5 = new Node(3);
        Node node6 = new Node(5);
        root.left = node1;
        root.righjt = node2;
        node1.left = node3;
        node1.righjt = node4;
        node4.left = node5;
        node4.righjt = node6;
        solution s = new solution();
        s.qianxu(root);
        System.out.println(s.isLeafAP());
    }

    boolean isLeafAP() {
        boolean flag = true;
        int sum = list.size();
        int t = list.get(1) - list.get(0);
        for (int i = 2; i < sum; i++) {
            if (list.get(i) - list.get(i - 1) != t) {
                flag = false;
            }
        }
        return flag;
    }

    void qianxu(Node root) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.righjt == null) {
            list.add(root.val);
        }
        qianxu(root.left);
        qianxu(root.righjt);

    }
}