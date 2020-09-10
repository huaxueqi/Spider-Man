package 集合.MAP集合;

import java.util.LinkedHashMap;
import java.util.Map;

public class totalStringSum {
    public static void main(String[] args) {
        totalStringSum.pringStringSum("chenmowanger");
    }
    public  static void  pringStringSum(String s){
        Map<Character,Integer> sums=new LinkedHashMap<>();

        for(char c:s.toCharArray()){
            sums.merge(c,1,Integer::sum);
        }
        System.out.println(sums);
    }
}

