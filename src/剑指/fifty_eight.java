package 剑指;

public class fifty_eight {
    //获得下一个树的下一个节点
    public static void main(String[] args) {
        TreeLinkNode root = new TreeLinkNode(4);
        TreeLinkNode first = new TreeLinkNode(2);
        TreeLinkNode second = new TreeLinkNode(6);
        TreeLinkNode three = new TreeLinkNode(1);
        TreeLinkNode four = new TreeLinkNode(3);
        root.left = first;
        root.right = second;
        first.left = three;
        first.right = four;
        System.out.println(fifty_eight.GetNext(first).val);
    }

    static TreeLinkNode GetNext(TreeLinkNode node) {
        if (node == null) return null;
        if (node.right != null) {    //如果有右子树，则找右子树的最左节点
            node = node.right;
            while (node.left != null) node = node.left;
            return node;
        }
        while (node.next != null) { //没右子树，则找第一个当前节点是父节点左孩子的节点
            if (node.next.left == node) return node.next;
            node = node.next;
        }
        return null;   //退到了根节点仍没找到，则返回null
    }
}

class TreeLinkNode {
    int val;
    TreeLinkNode left = null;
    TreeLinkNode right = null;
    TreeLinkNode next = null;

    TreeLinkNode(int val) {
        this.val = val;
    }
}

