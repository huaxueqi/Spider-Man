package 力扣;

public class Daoyumianji {
    //最大岛屿面积
    public static void main(String[] args) {
     int a[][]={{0,0,1,0,0,0,0,1,0,0,0,0,0},
             {0,0,0,0,0,0,0,1,1,1,0,0,0},
             {0,1,1,0,1,0,0,0,0,0,0,0,0},
             {0,1,0,0,1,1,0,0,1,0,1,0,0},
             {0,1,0,0,1,1,0,0,1,1,1,0,0},
             {0,0,0,0,0,0,0,0,0,0,1,0,0},
             {0,0,0,0,0,0,0,1,1,1,0,0,0},
             {0,0,0,0,0,0,0,1,1,0,0,0,0}};
         Daoyumianji D=new Daoyumianji();
         System.out.println(a.length);
         System.out.println(D.maxAreaOfIsland(a));
    }
    public int maxAreaOfIsland(int[][] grid) {
        int res=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]==1){
                    res=Math.max(res,dfs(i,j,grid));
                }
            }
        }
        return  res;
    }
    int  dfs(int i,int j,int a[][]){
        if(i<0 || j<0 || i>=a.length || j>=a[i].length || a[i][j]==0 ){
            return 0;
        }
        a[i][j]=0;
        int num=1;
        num+=dfs(i+1,j,a);
        num+=dfs(i-1,j,a);
        num+=dfs(i,j+1,a);
        num+=dfs(i,j-1,a);
        return num;
    }
}
