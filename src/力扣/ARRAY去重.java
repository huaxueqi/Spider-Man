package 力扣;

public class ARRAY去重 {
    public static void main(String[] args) {
        int a[]={1,1,2,2,3,3,4};
        int length=a.length;
        int j=1;
        for (int i=0;i<a.length-1;i++){
            if(a[i]==a[i+1])
                length--;
            else
                a[j++]=a[i+1];
        }
        System.out.println(length);
    }

    public  static int quchong(int n[]){

        return 0;
    }
}
