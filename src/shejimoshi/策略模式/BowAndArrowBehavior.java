package shejimoshi.策略模式;

class BowAndArrowBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("实现用弓箭射击...");
    }
}