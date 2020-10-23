package 剑指;

import java.util.function.Function;
public class two {
    public static void main(String[] args) {
      System.out.println(two.replaceBlack("dsgasgd adgas asdgas adsg "));
        String content = "Hello JDK8";
        Function<Integer, String> func = content::substring;
        String result = func.apply(0);
        System.out.println(result);
    }
    public  static String  replaceBlack(String input){
        if(input == null)
            return null;
        StringBuffer buffer =new StringBuffer();
        for(int i=0;i<input.length();i++){
            if(input.charAt(i) == ' '){
                buffer.append("%20");
            }else{
                buffer.append(input.charAt(i));
            }
        }
      return new String(buffer);
    }


    public String replaceSpace(String s) {
        if(s == null)
            return null;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                sb.append("%20");
            }else{
                sb.append(s.charAt(i));
            }
        }
        return  new String(sb);
    }
}
