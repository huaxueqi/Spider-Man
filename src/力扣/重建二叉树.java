package 力扣;

import java.util.HashMap;

public class 重建二叉树 {
    /**
     * 输入某二叉树的前序遍历和中序遍历的结果，请重建该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
     */

    public static void main(String[] args) {

    }

    HashMap<Integer, Integer> dic = new HashMap<>();
    int[] po;

    public demo4.TreeNode buildTree(int[] preorder, int[] inorder) {
        po = preorder;
        for (int i = 0; i < inorder.length; i++)
            dic.put(inorder[i], i);
        return recur(0, 0, inorder.length - 1);
    }

    demo4.TreeNode recur(int pre_root, int in_left, int in_right) {
        if (in_left > in_right) return null;
        demo4.TreeNode root = new demo4.TreeNode(po[pre_root]);
        int i = dic.get(po[pre_root]);
        root.left = recur(pre_root + 1, in_left, i - 1);
        root.right = recur(pre_root + i - in_left + 1, i + 1, in_right);
        return root;
    }

}
