package shejimoshi.备忘录模式;

public class Test {
    public static void main(String[] args) {
        /**
         * 创建原始对象
         */
        Original original = new Original("白天模式");
        System.out.println("original初始状态为：" + original.getState());
        /**
         * 创建备忘录
         *
         * 注意：original.createMemento()会将初始state(白天模式)传给Memento对象
         *
         * 以备需要的时候可以调用storage.getMemento()来拿到该state(白天模式)状态
         *
         * 相当于state(白天模式)这个状态已经委托给了storage这个对象来保存
         */
        Storage storage = new Storage(original.createMemento());
        original.setState("夜间模式");
        System.out.println("original修改后的状态为：" + original.getState());
        /**
         * 恢复备忘录
         */
        original.recoverMemento(storage.getMemento());
        System.out.println("original恢复后的状态为：" + original.getState());
    }
}