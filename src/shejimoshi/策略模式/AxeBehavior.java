package shejimoshi.策略模式;

class AxeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("实现用斧头劈砍...");
    }
}
