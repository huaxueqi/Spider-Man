package shejimoshi.策略模式;

public class Test {
    public static void main(String[] args) {
        Character king = new King();
        king.performWeapon();
        // 这里有点类似于“状态模式”
        king.setWeapon(new AxeBehavior());//改变策略
        king.performWeapon();

        Character queen = new Queen();
        queen.performWeapon();
        queen.setWeapon(new AxeBehavior());//改变策略
        queen.performWeapon();
    }
}