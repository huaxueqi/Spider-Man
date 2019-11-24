package 剑指;

public class two {
    public static void main(String[] args) {
      System.out.println(two.replaceBlack("dsgasgd adgas asdgas adsg "));
    }
    public  static String  replaceBlack(String input){
        if(input == null)
            return null;
        StringBuffer buffer =new StringBuffer();
        for(int i=0;i<input.length();i++){
            if(input.charAt(i) == ' '){
                buffer.append("%20");
            }else{
                buffer.append(String.valueOf(input.charAt(i)));
            }
        }
      return new String(buffer);
    }
}
