package 剑指;

import java.util.Stack;

public class sixty_three {

    public static void main(String[] args) {

    }
    TreeNode KthNode(TreeNode pRoot, int k) {
        Stack<TreeNode> stack = new Stack<>();
        if (k <= 0 || pRoot == null) return null;
        while (!stack.isEmpty() || pRoot != null) {
            while (pRoot != null) {
                stack.push(pRoot);
                pRoot = pRoot.left;
            }
            pRoot = stack.pop();
            if (k == 1) return pRoot;
            else k--;
            pRoot = pRoot.right;
        }
        return null;
    }
}
