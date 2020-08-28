package shejimoshi.命令模式;

public class OrderCommand implements Command {
    private CookReceiver cook;

    public OrderCommand(CookReceiver cook) {
        this.cook = cook;
    }

    @Override
    public void execute() {
        cook.cooking();
    }

    @Override
    public void undo() {
        cook.unCooking();
    }
}
