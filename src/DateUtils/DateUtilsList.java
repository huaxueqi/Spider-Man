package DateUtils;

import org.apache.commons.lang.time.DateUtils;

import java.util.Date;

public class DateUtilsList {
    public static void main(String[] args) {
        Date d=new Date();
        System.out.println(DateUtils.addDays(d,1));
    }
}
