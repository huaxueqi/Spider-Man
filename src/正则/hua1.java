package 正则;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class hua1 {


  public static void main(String[] args) {
       String  s="广东省佛山市顺德区勒流镇百丈新村工业三路一号";
       hua1 h=new hua1();
       String validateStr = "^[\\w\\-－＿[０-９]\u4e00-\u9fa5\uFF21-\uFF3A\uFF41-\uFF5A]+$";
        boolean rs = matcher(validateStr, s);
      System.out.println(Pattern.matches(validateStr,s));
      Scanner sc =new Scanner(System.in);
      System.out.println(rs);

   }
    private static boolean matcher(String reg, String string) {

        boolean tem = false;

        Pattern pattern = Pattern.compile(reg);

        Matcher matcher = pattern.matcher(string);

        tem = matcher.matches();

        return tem;

    }
}
