package 剑指;

/**
 * 交换每个节点的左右子树位置
 */
public class nineteen {
 public void Mirror(TreeNode root){
     if(root == null) return;
     TreeNode tmp=root.left;
     root.left=root.right;
     root.right=tmp;
     Mirror(root.left);
     Mirror(root.right);
 }
}
