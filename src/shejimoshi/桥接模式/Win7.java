package shejimoshi.桥接模式;

public class Win7 extends Computer {
    @Override
    public void connection(Driver driver) {
        System.out.println("Win7 Computer");
        driver.method();
    }
}
