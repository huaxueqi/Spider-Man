package 剑指;

/**
 * 输入一个二叉树A,B。判断A是否为B的子结构，空树不为任何一个树的子结构
 */
public class eighteen {
    //
    public static void main(String[] args) {
    }
   public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if(root1 == null || root2 == null) return  false;
        return  HasSubtree(root1.left,root2) || HasSubtree(root1.right,root2) ||
                jump(root1,root2);
    }
    public boolean jump(TreeNode t1,TreeNode t2){
        if(t2 == null) return true;
        if(t1 == null) return false;
        if(t1.val != t2.val)  return false;
        return jump(t1.left,t2.left) && jump(t1.right,t2.right);
    }
}
