package 字符串;
//判断一个字符串是否前后对称
public class demo2 {
    public static void main(String[] args) {
demo2.duichen("沉默王二 二王默沉");
    }
    public  static  void duichen(String s){
        Boolean result=true;
        int length=s.length();
        for(int i=0;i<length/2;i++){
            if(s.charAt(i)!=s.charAt(length-i-1)){
                result=false;
                break;
            }
        }
        System.out.println(result);
    }
}
