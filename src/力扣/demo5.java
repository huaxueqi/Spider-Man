package 力扣;

import java.util.AbstractMap;
import java.util.LinkedList;
import java.util.Queue;

public class demo5 {
    //剑指 Offer 13. 机器人的运动范围
    public static void main(String[] args) {

    }
    public int movingCount(int m, int n, int k) {
        boolean[][] visited = new boolean[m][n];
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0,0});//存放数组，第一位是i，第两位是j
        int ans = 0;
        while(queue.size() >0){
            int[] temp = queue.poll();
            int i = temp[0],j = temp[1];
            int sum=i/10+i%10+j/10+j%10;
            if(i>=m || j>=n|| visited[i][j] || sum > k) continue;
            visited[i][j] = true;
            ans++;
            queue.offer(new int[]{i+1,j});
            queue.offer(new int[]{i,j+1});
        }
        return ans;
    }


}
