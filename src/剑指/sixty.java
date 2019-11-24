package 剑指;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class sixty {
    public static void main(String[] args) {

    }
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (pRoot == null) return res;
        queue.offer(pRoot);
        int level = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();

                if (level % 2 != 0) {
                    list.add(0,node.val);
                } else {
                    list.add(node.val);
                }

                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }
            res.add(list);
            level++;
        }
        return res;
    }
}
