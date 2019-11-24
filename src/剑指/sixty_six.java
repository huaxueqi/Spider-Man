package 剑指;

public class sixty_six {
    public static void main(String[] args) {


    }
    public boolean hasPath(char[] matrix, int rows, int cols, char[] str) {
        int[] flag = new int[matrix.length];
        for (int i=0; i<rows; i++) {
            for (int j=0; j<cols; j++) {
                if (hasPath(matrix, rows, cols, str, i, j, 0, flag)) return true;
            }
        }
        return false;
    }

    public boolean hasPath(char[] matrix, int rows, int cols, char[] str, int i, int j, int k, int[] flag) {
        int index = i*cols+j;
        if (i<0||i>=rows||j<0||j>=cols||matrix[index]!=str[k]||flag[index]==1) return false;
        if (k==str.length-1) return true;
        flag[index] = 1;
        if (hasPath(matrix, rows, cols, str, i-1, j, k+1, flag)||
                hasPath(matrix, rows, cols, str, i+1, j, k+1, flag)||
                hasPath(matrix, rows, cols, str, i, j-1, k+1, flag)||
                hasPath(matrix, rows, cols, str, i, j+1, k+1, flag)) return true;
        flag[index] = 0;
        return false;
    }

}
