package 语法;

import org.apache.commons.lang.StringUtils;

public class testEmpty {
    public static void main(String[] args) {
        /*String s1=" ";
        String s2=null;
        String s3=new String();
        System.out.println(s1.isEmpty());
        System.out.println(StringUtils.isEmpty(s1));
        System.out.println(StringUtils.isNotEmpty(s1));
        //System.out.println(s3.isEmpty());
        //System.out.println(StringUtils.isEmpty(s2));
        System.out.println(StringUtils.isNotBlank(s1));
        System.out.println(StringUtils.isBlank(s1));*/


        /*Object [] a={'a','b','s','d','q','y','i','o','d','\n','y',' ','c'};
        System.out.println(StringUtils.join(a));
        System.out.println(StringUtils.deleteWhitespace(StringUtils.join(a)));*/
        String center="dgasSDAF";
        System.out.println(StringUtils.center(center,10));
        System.out.println(StringUtils.swapCase(center));

    }
}
