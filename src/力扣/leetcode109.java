package 力扣;

public class leetcode109 {
    public static void main(String[] args) {

    }
    public boolean isFlipedString(String s1, String s2) {
        char s1char []=s1.toCharArray();
        StringBuilder sb=new StringBuilder();
        for(int i=s1char.length-1;i>=0;i--){
            sb.append(s1char[i]);
        }
        if(sb.equals(s2)){
            return  true;
        }
        return  false;
    }
    public  boolean  istrueorfalse(String s1, String s2){
        return s1.equals(s2)||(s1.length()==s2.length()&&(s1+s1).contains(s2));
    }
}
