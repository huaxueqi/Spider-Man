package shejimoshi.命令模式;

public class Test {
    public static void main(String[] args) {
        /**
         * 等待口令的执行者 --炒菜总得有个厨师吧.
         */
        CookReceiver receiver = new CookReceiver();
        /**
         * 等待将口令传达给厨师 --因为顾客要什么菜还不知道，但口令始终要传达到厨师耳朵里这是肯定的。
         */
        Command cmd = new OrderCommand(receiver);
        Customer customer = new Customer(cmd);
        /**
         * 执行口令
         */
        customer.order();
        /**
         * 撤销口令
         */
        customer.unOrder();
    }
}