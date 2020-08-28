package shejimoshi.桥接模式;

public class WinXP extends Computer {
    @Override
    public void connection(Driver driver) {
        System.out.println("WinXP Computer");
        driver.method();
    }
}