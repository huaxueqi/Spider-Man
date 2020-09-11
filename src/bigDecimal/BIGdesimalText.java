package bigDecimal;

import java.math.BigDecimal;

public class BIGdesimalText {
    public static void main(String[] args) {
        BigDecimal num = new BigDecimal("2.456987");
        System.out.println(num.scale());
        BigDecimal b = new BigDecimal("2.225667").setScale(2, BigDecimal.ROUND_DOWN);
        System.out.println(b);
        BigDecimal C = new BigDecimal("2.220667").setScale(2, BigDecimal.ROUND_UP);
        System.out.println(C);
        BigDecimal f = new BigDecimal("2.224667").setScale(2, BigDecimal.ROUND_CEILING);
        System.out.println(f);//2.23 如果是正数，相当于BigDecimal.ROUND_UP

        BigDecimal g = new BigDecimal("-2.225667").setScale(2, BigDecimal.ROUND_CEILING);
        System.out.println(g);//-2.22 如果是负数，相当于BigDecimal.ROUND_DOWN


        BigDecimal l = new BigDecimal("2.2856").setScale(4, BigDecimal.ROUND_UNNECESSARY);
        System.out.println(l);
        //断言请求的操作具有精确的结果，因此不需要舍入。
        //如果对获得精确结果的操作指定此舍入模式，则抛出ArithmeticException。
    }
}
