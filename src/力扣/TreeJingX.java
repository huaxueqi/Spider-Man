package 力扣;

public class TreeJingX {
    //二叉树的镜像
    public static void main(String[] args) {
        demo4.TreeNode root = new demo4.TreeNode(1);
        demo4.TreeNode node1 = new demo4.TreeNode(2);
        demo4.TreeNode node2 = new demo4.TreeNode(3);
        demo4.TreeNode node3 = new demo4.TreeNode(4);
        demo4.TreeNode node4 = new demo4.TreeNode(5);
        demo4.TreeNode node5 = new demo4.TreeNode(6);
        demo4.TreeNode node6 = new demo4.TreeNode(7);
        demo4.TreeNode node7 = new demo4.TreeNode(8);
        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;
        node2.left = node5;
        node2.right = node6;
        node3.left = node7;
        bianli(TreeJingX.mirrorTree(root));
    }

    public static demo4.TreeNode mirrorTree(demo4.TreeNode root) {
        if (root == null) {
            return null;
        }
        demo4.TreeNode leftRoot = mirrorTree(root.right);
        demo4.TreeNode rightRoot = mirrorTree(root.left);
        root.left = leftRoot;
        root.right = rightRoot;
        return root;
    }

    public static void bianli(demo4.TreeNode root) {
        if (root == null) return;
        bianli(root.left);
        bianli(root.right);
        System.out.println(root.val + " ");
    }
}
