package 力扣;

import java.util.Arrays;

public class BBAI01 {
    public static void main(String[] args) {
        int[] a ={1,2,5};
        System.out.println(BBAI01.coinChange(a,11));
    }

    public static int coinChange(int[] coins, int amount) {
        int[][] dp = new int[coins.length + 1][amount + 1];
        //BaseCase条件
        for (int[] n : dp
        ) {
            Arrays.fill(n, amount + 1);
        }

        for (int i = 0; i <= coins.length; i++) {
            dp[i][0] = 0;
        }

        //套模板
        for (int i = 1; i <= coins.length; i++) {
            for (int j = 1; j <= amount; j++) {
                if (j >= coins[i - 1] && dp[i][j - coins[i - 1]] != amount + 1) {
                    //这里注意如果选择第i个硬币,那么就是dp[i][j-coins[i-1]]+1
                    dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - coins[i - 1]] + 1);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        if (dp[coins.length][amount] == amount + 1) {
            dp[coins.length][amount] = -1;
        }

        return dp[coins.length][amount];
    }


}
