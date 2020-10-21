package 力扣;

import java.util.ArrayList;
import java.util.List;

public class demo2 {
    //全排列问题
    public static void main(String[] args) {
        char[] a = {'1', '2', '3', '4'};
        permute(a).forEach(l -> {
            System.out.println(l);
        });
    }

    public static List<List<Character>> permute(char[] nums) {
        List<List<Character>> res = new ArrayList<>();
        char[] b = new char[4];
        hiusufa(res, nums, new ArrayList(), b);
        return res;
    }

    public static void hiusufa(List<List<Character>> res, char[] a,
                               ArrayList<Character> tmp, char[] b) {
        if (tmp.size() == a.length) {
            res.add(new ArrayList<>(tmp));
            return;
        }
        for (int i = 0; i < a.length; i++) {
            // if(b[i]=='5') continue;
            if (tmp.contains(a[i])) continue;
            //b[i]='5';  //回溯
            tmp.add(a[i]);
            hiusufa(res, a, tmp, b);
            //b[i]='4';  //撤销上一步的操作
            tmp.remove(tmp.size() - 1);
        }
    }
}
