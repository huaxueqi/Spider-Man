package 从0开始;

import java.util.HashMap;
import java.util.Map;

class singleNumber {
    public static int singleNumber1(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result = result ^ nums[i];
        }
        return result;
    }

    public static void singleNumber2(int[] nums) {
        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            m.put(nums[i], m.containsKey(nums[i]) ? m.get(nums[i]) + 1 : 1);
        }
        m.forEach((k, v) -> {
            if (v == 1) {
                System.out.println(k);
            }
        });


    }

    public static void main(String[] args) {
        System.out.println(singleNumber.singleNumber1(new int[]{4, 1, 2, 1, 2}));
        singleNumber2(new int[]{4, 1, 2, 1, 2});
    }
}