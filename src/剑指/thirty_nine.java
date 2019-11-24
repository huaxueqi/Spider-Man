package 剑指;

public class thirty_nine {
    public static void main(String[] args) {

    }
    public int TreeDepth(TreeNode root) {
        if( root == null)
            return 0;
       int  count=Math.max(TreeDepth(root.left),TreeDepth(root.right))+1;
       return count;
    }
}
