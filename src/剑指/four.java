package 剑指;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class four {
    public static void main(String[] args) {
       four f=new four();
        // 前序遍历结果
        int[] a = {1, 2, 4, 7, 3, 5, 6, 8};
        // 中序遍历结果
        int[] b = {4, 7, 2, 1, 5, 3, 8, 6};
        TreeNode root=f.solution(a,b);
        f.bianli(root).forEach(l->{
            System.out.print(l+" ");
        });

    }
    public TreeNode solution(int a[],int b[]) {
        if (a == null || b == null || a.length == 0 || b.length == 0) {
            return null;
        }
        if (a.length != b.length) {
            return null;
        }
        TreeNode root = new TreeNode(a[0]);
        for (int i = 0; i < a.length; i++) {
            if (a[0] == b[i]) {
                root.left = solution(Arrays.copyOfRange(a, 1, i + 1), Arrays.copyOfRange(b, 0, i));
                root.right = solution(Arrays.copyOfRange(a, i + 1, a.length), Arrays.copyOfRange(b, i + 1, b.length));
            }
        }
        return root;
    }
    public void preorder(TreeNode root){
        if(root == null)
            return;
         preorder(root.left);
         preorder(root.right);
         System.out.print(root.val+"  ");
    }
    public ArrayList<Integer> bianli(TreeNode root){
        ArrayList<Integer> list=new ArrayList<>();
        if(root == null){
            return list;
        }
        LinkedList<TreeNode> q =new LinkedList<>();
        TreeNode tmp ;
        q.offer(root);
        while (!q.isEmpty()){
            tmp=q.poll();//出队
            //System.out.print(tmp.val+" ");
            list.add(tmp.val);
            if(tmp.left != null)
                q.offer(tmp.left);
            if(tmp.right != null)
                q.offer(tmp.right);
        }
        return list;
    }

}
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode (int x){
        this.val=x;
    }
}
