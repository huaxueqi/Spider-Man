package 正则;

import java.util.regex.Pattern;

public class ZZ {
    public static void main(String[] args) {
        String  s="广东省佛山市顺德区勒流镇百丈新村工业三路一号";
        Double d=new Double(20.23);
        ZZ h=new ZZ();
        String validateStr = "[0-9]*.?[0-9]+";
        //boolean rs = matcher(validateStr, s);
        //System.out.println(Pattern.matches(d,s));
        //Scanner sc =new Scanner(System.in);
        //System.out.println(rs);
        String f=String.valueOf(d);
        System.out.println(Pattern.matches(validateStr,f));

    }


}
