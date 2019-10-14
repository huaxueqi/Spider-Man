package 剑指;

/**
 * 输入一个数组，判断该数组是不是某而二叉搜索树的后序遍历结果
 * 前面小于，后面大于就是正确的
 */
public class twenty_three {
    public static void main(String[] args) {
        int []a={2,4,3,6,8,7,5};
        System.out.println(twenty_three.istree(a));
    }
    public static boolean istree(int a[]){
        if(a.length==0)
            return false;
        int root=a.length-1;
        int count=0;
        while(root !=0){
           while(a[count]<a[root]){
               ++count;
           }
           while(a[count]>a[root]){
               ++count;
           }
           if(count!=root){
               return false;
           }
           root--;
           count=0;
        }
        return true;
    }

}
