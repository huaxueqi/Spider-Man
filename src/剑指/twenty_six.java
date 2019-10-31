package 剑指;

/**
 * 输入一棵二叉搜索树，将该二叉搜索树转换为一个排序的双向链表，要求不能创建任何新的节点
 *
 */
public class twenty_six {
    public static void main(String[] args) {

    }
    TreeNode pre=null;
    TreeNode head=null;
    public TreeNode convert(TreeNode root){
        if (root == null){
            return null;
        }
        convert(root.left);
        root.left=pre;
        if(pre!=null){
            pre.right=root;
        }
        pre=root;
        if(head==null){
            head=root;
        }
        convert(root.right);
        return head;
    }
}
