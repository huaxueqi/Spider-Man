package 剑指;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class four {
    public static void main(String[] args) {
        four f = new four();
        // 前序遍历结果
        //int[] a = {1, 2, 4, 7, 3, 5, 6, 8};
        // 中序遍历结果
        //int[] b = {4, 7, 2, 1, 5, 3, 8, 6};

        int[] a = {3, 9, 20, 15, 7};
        // 中序遍历结果
        int[] b = {9, 3, 15, 20, 7};
        /*TreeNode root = f.solution(a, b);
        f.Print(root).forEach(l -> {
            System.out.print(l + " ");
        });*/
        //System.out.println();
        f.preorder(f.solution(a, b));

    }

    //已知前序、中序，重建这颗树
    public TreeNode solution(int[] a, int[] b) {
        if (a == null || b == null || a.length == 0 || b.length == 0) {
            return null;
        }
        if (a.length != b.length) {
            return null;
        }
        TreeNode root = new TreeNode(a[0]);//a[0]是根节点
        for (int i = 0; i < a.length; i++) {
            if (a[0] == b[i]) {
                root.left = solution(Arrays.copyOfRange(a, 1, i + 1), Arrays.copyOfRange(b, 0, i));//复制数组，包含下标，不包含上标
                root.right = solution(Arrays.copyOfRange(a, i + 1, a.length), Arrays.copyOfRange(b, i + 1, b.length));
            }
        }
        return root;
    }

    //前序遍历
    public void preorder(TreeNode root) {
        if (root == null)
            return;
        System.out.print(root.val + "  ");
        preorder(root.left);
        preorder(root.right);
    }

    //树的层次遍历
    public ArrayList<Integer> bianli(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        LinkedList<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            TreeNode tmp = q.poll();//出队
            //System.out.print(tmp.val+" ");
            list.add(tmp.val);
            if (tmp.left != null)
                q.offer(tmp.left);
            if (tmp.right != null)
                q.offer(tmp.right);
        }
        Integer[] arr = new Integer[list.size()];
        list.toArray(arr);
        for (int a : arr) {
            System.out.print(a + "   ");
        }
        return list;
    }

    //树的层次遍历
    public int[] levelOrder(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        if (root == null) {
            return new int[0];
        }
        LinkedList<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            TreeNode tmp = q.poll();//出队
            list.add(tmp.val);
            if (tmp.left != null)
                q.offer(tmp.left);
            if (tmp.right != null)
                q.offer(tmp.right);
        }
        int[] arr = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }

    //树的层次遍历
    ArrayList<Integer> Print(TreeNode pRoot) {
        //ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (pRoot == null) return list;
        queue.offer(pRoot);
        //树的层次遍历
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                list.add(node.val);
                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }
        }
        return list;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        this.val = x;
    }
}
