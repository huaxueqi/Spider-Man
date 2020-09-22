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
}
