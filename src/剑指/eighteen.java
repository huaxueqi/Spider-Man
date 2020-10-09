package 剑指;

import 信号量.Demo5;

/**
 * 输入一个二叉树A,B。判断A是否为B的子结构，空树不为任何一个树的子结构
 */
public class eighteen {
    //
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode r1 = new TreeNode(2);
        TreeNode r2 = new TreeNode(3);
        TreeNode r3 = new TreeNode(4);
        TreeNode r4 = new TreeNode(5);
        TreeNode r5 = new TreeNode(6);


    }

    public boolean HasSubtree(TreeNode root1, TreeNode root2) {
        if (root1 == null || root2 == null) return false;
        return HasSubtree(root1.left, root2) || HasSubtree(root1.right, root2) ||
                jump(root1, root2);
    }

    public boolean jump(TreeNode t1, TreeNode t2) {
        if (t2 == null) return true;
        if (t1 == null) return false;
        if (t1.val != t2.val) return false;
        return jump(t1.left, t2.left) && jump(t1.right, t2.right);
    }
}
