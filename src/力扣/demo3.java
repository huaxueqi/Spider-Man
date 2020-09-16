package 力扣;

import java.util.*;

public class demo3 {
    /**
     * 给定一个无重复元素的数组 candidates 和一个目标数 target ，找出 candidates
     * 中所有可以使数字和为 target 的组合。
     * candidates 中的数字可以无限制重复被选取。

     */
    private List<Integer> list = new LinkedList<>();
    private List<List<Integer>> res = new LinkedList<>();
    private int n;

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        if (candidates == null || (this.n = candidates.length) == 0)
            return res;
        Arrays.sort(candidates);
        solve(0, 0, target, candidates);
        return res;
    }

    private void solve(int index, int sum, int target, int[] a) {
        if (sum == target) {
            res.add(new LinkedList<>(list));
            return;
        }
        // 剪枝增加一个特判，判断当前剩余值是否小于当前元素值
          else if (sum > target || index >= n || target - sum< a[index])
            return;
        list.add(a[index]);
        // 选择当前值，下一次仍然从当前开始做出抉择
        solve(index, sum + a[index], target, a);
        list.remove(list.size()-1);
        // 放弃当前值，才继续从下一个元素做出选择
        solve(index + 1, sum, target, a);
    }
    public static void main(String[] args) {
        demo3 solution = new demo3();
        int[] candidates = new int[]{2, 3, 6, 7};
        int target = 7;
        List<List<Integer>> res = solution.combinationSum1(candidates, target);
        System.out.println("输出 => " + res);

    }

    public List<List<Integer>> combinationSum1(int[] candidates, int target) {
        int len = candidates.length;
        List<List<Integer>> res = new ArrayList<>();
        if (len == 0) {
            return res;
        }

        Arrays.sort(candidates);
        Deque<Integer> path = new ArrayDeque<>();
        dfs(candidates, 0, len, target, path, res);
        return res;
    }

    private void dfs(int[] candidates, int begin, int len, int target, Deque<Integer> path, List<List<Integer>> res) {
        if (target == 0) {
            res.add(new ArrayList<>(path));
            return;
        }

        for (int i = begin; i < len; i++) {
            if (target - candidates[i] < 0) {
                break;
            }

            path.addLast(candidates[i]);
            System.out.println("递归之前 => " + path + "，剩余 = " + (target - candidates[i]));

            dfs(candidates, i, len, target - candidates[i], path, res);
            path.removeLast();
            System.out.println("递归之后 => " + path);
        }
    }

}
