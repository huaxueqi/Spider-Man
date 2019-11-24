package 剑指;

import java.util.HashMap;
import java.util.Map;

public class thirty_eight {
    public static void main(String[] args) {
        int a[]={2,3,5,6,7,2,2,3,5};
        System.out.println(thirty_eight.GetNumberOfK(a,2));
    }
    public static  int GetNumberOfK(int [] array , int k) {
        Map<Integer,Integer> m=new HashMap<>();
        m.put(k,0);
        for(int a:array) {
            if (a == k) {
                m.put(a, m.containsKey(a) ? m.get(a) + 1 : 1);
            }
        }
      return m.get(k);
    }
}
