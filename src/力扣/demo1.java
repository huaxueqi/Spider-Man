package 力扣;

import java.util.HashSet;
import java.util.Set;

public class demo1 {
    public static void main(String[] args) {
        System.out.println(demo1.findRepeatNumber(new int[]{0, 1, 2, 3, 4, 11, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}));
    }

    public static int findRepeatNumber(int[] nums) {
        Set s = new HashSet();
        for (int n : nums) {
            if (!s.add(n)) {
                return n;
            }
        }
        return -1;
    }
}
