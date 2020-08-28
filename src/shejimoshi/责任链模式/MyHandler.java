package shejimoshi.责任链模式;

public class MyHandler extends AbstractHandler implements Handler {
    private String name;

    public MyHandler(String name) {
        this.name = name;
    }

    @Override
    public void operator() {
        if (getHandler() != null) {
            System.out.print(name + "，将BUG交给——>");
            /**
             * 这里是关键。【注意1】这里不是递归哦~
             *
             * 递归：A(operator)——>A(operator)——>A(operator)
             *
             * 责任链：A(operator)——>B(operator)——>C(operator)
             */
            getHandler().operator();
        } else {
            System.out.println(name + "处理BUG...\n");
        }
    }
}