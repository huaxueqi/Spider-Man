package 字符串.字符串算法;

import java.util.HashMap;
import java.util.Map;

/*
找出一个字符串中最大不重复子串
滑动窗口
 */
public class demo1 {
    public static void main(String[] args) {
  String s="abbnbbcccccddda";
       System.out.println(demo1.lengthOfLongestSubstring1(s));

    }

        public static int lengthOfLongestSubstring(String s) {
            int n = s.length(), ans = 0;
            Map<Character, Integer> map = new HashMap<>();
            // try to extend the range [i, j]
            for (int j = 0, i = 0; j < n; j++) {
                if (map.containsKey(s.charAt(j))) {
                    i = Math.max(map.get(s.charAt(j)), i);
                }
                ans = Math.max(ans, j - i + 1);
                map.put(s.charAt(j), j + 1);
            }
            return ans;
        }



    public static int lengthOfLongestSubstring1(String s) {
        int res = 0;
        if(s.length() == 0)
            return res;
        // 创建HashMap，用来保存字符与位置之间的对应关系
        HashMap<Character, Integer> hashMap = new HashMap<>();
        // 初始化左指针和右指针，并遍历字符串
        for(int left = 0, right = 0; right < s.length(); right++){
            // 判断右指针指向的字符是否出现过
            if(hashMap.containsKey(s.charAt(right))){
                // 确定左指针的位置
                left = Math.max(left, hashMap.get(s.charAt(right)));
            }
            // 对于第一次出现的字符，保存该字符的位置；对于多次出现的字符，更新该字符出现的位置
            hashMap.put(s.charAt(right), right+1);
            // 更新窗口的大小，保存最大的窗口大小
            res = Math.max(res, right-left+1);
        }
        return res;
    }

}
