package 力扣;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class demo3 {
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

    }
}
