package huangrenhe;

import java.sql.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Permutation {
    public static void main(String[] args) {
          Permutation permutation = new Permutation();
        System.out.println(Arrays.toString(permutation.permutation("abbb")));
    }
    List<String> strings = new LinkedList<>();
    char[] chars;

    public String[] permutation(String string){
        chars = string.toCharArray();
        dfs(0);
        return strings.toArray(new String[strings.size()]);//创建一个这么长的数组
    }

    void dfs(int x){
        if (x == chars.length-1){
            strings.add(String.valueOf(chars));//添加排列方案
            return;
        }
        HashSet<Character> hashSet = new HashSet<>();
        for (int i=x;i<chars.length;i++){
            if (hashSet.contains(chars[i])) continue;//重复剪枝
            hashSet.add(chars[i]);
            swap(i,x);
            dfs(x+1);
            swap(i,x);
        }
    }

    void swap(int a,int b){
        char tmp = chars[a];
        chars[a]=chars[b];
        chars[b]=tmp;
    }
}
