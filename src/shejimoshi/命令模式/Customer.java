package shejimoshi.命令模式;

public class Customer {
    private Command command;

    public Customer(Command command) {
        this.command = command;
    }

    /**
     * 将命令的发出与执行分开
     */
    public void order() {
        command.execute();
    }

    public void unOrder() {
        command.undo();
    }
}