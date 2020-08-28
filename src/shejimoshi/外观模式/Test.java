package shejimoshi.外观模式;

public class Test {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.startup();
        System.out.println();
        computer.shutdown();
    }
}