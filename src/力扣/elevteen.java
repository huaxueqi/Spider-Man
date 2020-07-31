package 力扣;

public class elevteen {
    public static void main(String[] args) {
       int a[][]={ {1,2,3},
               {4,5,6},
               {7,8,9}};
        elevteen.rotate1(a);
    }

        public static void rotate(int[][] matrix) {
            int n = matrix.length;

            for(int i=0;i<matrix.length;i++){
                for(int j=0;j<matrix[i].length;j++){
                    System.out.print(matrix[i][j]+",");
                }
                System.out.println();
            }


            // 先以对角线（左上-右下）为轴进行翻转
            for (int i = 0; i < n - 1; i++) {
                for (int j = i + 1; j < n; j++) {
                    int tmp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = tmp;
                }
            }

            for(int i=0;i<matrix.length;i++){
                for(int j=0;j<matrix[i].length;j++){
                    System.out.print(matrix[i][j]+",");
                }
                System.out.println();
            }

            // 再对每一行以中点进行翻转
            int mid = n >> 1;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < mid; j++) {
                    int tmp = matrix[i][j];
                    matrix[i][j] = matrix[i][n - 1 - j];
                    matrix[i][n - 1 - j] = tmp;
                }
            }

            for(int i=0;i<matrix.length;i++){
                for(int j=0;j<matrix[i].length;j++){
                    System.out.print(matrix[i][j]+",");
                }
                System.out.println();
            }

        }
    public static void  rotate1(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
            for (int j = 0; j < n / 2; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[i][n - j - 1];
                matrix[i][n - j - 1] = tmp;
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+",");
            }
            System.out.println();
        }
    }

}
