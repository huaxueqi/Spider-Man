package shejimoshi.外观模式;

class Computer {
    private Memory memory;
    private CPU cpu;

    public Computer() {
        memory = new Memory();
        cpu = new CPU();
    }

    public void startup() {
        System.out.println("begin to start the computer...");
        memory.startup();
        cpu.startup();
        System.out.println("computer start finished...");
    }

    public void shutdown() {
        System.out.println("begin to close the computer...");
        memory.shutdown();
        cpu.shutdown();
        System.out.println("computer close finished...");
    }
}
