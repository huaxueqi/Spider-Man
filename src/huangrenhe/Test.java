package huangrenhe;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {

    public static boolean isIpAddress(String address){
        //IPv4的ip地址格式：（1~255）.（0~255）.（0~255）.（0~255）


        String regex = "(((2[0-4]d)|(25[0-5]))|(1d{2})|([1-9]d)|(d))[.](((2[0-4]d)|(25[0-5]))|(1d{2})|([1-9]d)|(d))[.]"
                + "(((2[0-4]d)|(25[0-5]))|(1d{2})|([1-9]d)|(d))[.](((2[0-4]d)|(25[0-5]))|(1d{2})|([1-9]d)|(d))";

        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(address);

        Pattern compile = Pattern.compile(regex);//正则
        Matcher matcher = compile.matcher(address);//去掉大小写
        return m.matches();

    }

        public static void main(String[] args) {
        String str="10.30.126.58";
        Test.isIpAddress(str);
    }
}
