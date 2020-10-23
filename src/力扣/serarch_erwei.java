package 力扣;

public class serarch_erwei {
    //二维数组中的查找，查找一个数是否存在

    /**
     * 将数组旋转，看成一个二叉树 ，从底向上查找，如果 大于 target 那么向上查找，如果小于target ，向右查找
     * 例 [1,   4,  7, 11, 15],
     * [2,   5,  8, 12, 19],
     * [3,   6,  9, 16, 22],
     * [10, 13, 14, 17, 24],
     * [18, 21, 23, 26, 30]
     * <p>
     * 越往右越大
     */
    public static void main(String[] args) {

    }

    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        int i = matrix.length - 1, j = 0;
        while (i >= 0 && j < matrix[0].length) {
            if (matrix[i][j] > target) i--;
            else if (matrix[i][j] < target) j++;
            else return true;
        }
        return false;
    }
}
