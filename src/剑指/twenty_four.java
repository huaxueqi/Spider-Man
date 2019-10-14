package 剑指;

import java.util.ArrayList;

/**
 * 输入一个二叉树，打印出二叉树中节点值为输入整数的所有路径
 */
public class twenty_four{
    public static void main(String[] args) {
        TreeNode root = new TreeNode(8);
        TreeNode node1 = new TreeNode(9);
        TreeNode node2 = new TreeNode(7);
        TreeNode node3 = new TreeNode(10);
        TreeNode node4 = new TreeNode(2);
        TreeNode node5 = new TreeNode(4);
        TreeNode node6 = new TreeNode(1);
        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;
        node4.left = node5;
        node4.right = node6;
        twenty_four t=new twenty_four();
        t.findpath(root,20).forEach(l->{
                System.out.println(l);
        });
    }
    private ArrayList<ArrayList<Integer>> listAll =new ArrayList<>();
    private ArrayList<Integer> list=new ArrayList<>();
    public  ArrayList<ArrayList<Integer>> findpath(TreeNode root,int targe){
        if(root == null) return listAll;
        list.add(root.val);
        targe -= root.val;
        if(targe == 0 && root.left==null && root.right == null){
            listAll.add(new ArrayList<>(list));
        }
        findpath(root.left,targe);
        findpath(root.right,targe);
        list.remove(list.size()-1);
        return listAll;
    }
}
