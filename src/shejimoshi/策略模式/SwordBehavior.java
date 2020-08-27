package shejimoshi.策略模式;

class SwordBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("实现用宝剑挥舞...");
    }
}
