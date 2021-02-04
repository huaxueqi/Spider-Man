package 从0开始;

public class findNumberIn2DArray {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        int i=matrix.length-1,j=0;
        while(i>=0 && j<=matrix[0].length-1){
                 if(target> matrix[i][j]) j++;
                 else if(target < matrix[i][j])i--;
                 else return true;
        }
        return false;
    }
}
