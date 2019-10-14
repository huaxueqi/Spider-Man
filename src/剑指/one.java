package 剑指;

public class one {
    public static void main(String[] args) {
       one o=new one();
       int a[][]={{1,2,3},{4,5,6},{7,8,9}};
       o.Find(5,a);
    }
    public  boolean Find(int targe,int a[][] ){
        int rows=a.length;
        int cols=a[0].length;
        int i=rows-1,j=0;  //左下角往上查找
        while(i>=0 && j<cols){
            if(targe<a[i][j])
                i--; //往上找
            else if(targe>a[i][j])
                j++;  //往右找
            else
                return true;
        }
        return false;
    }
}
