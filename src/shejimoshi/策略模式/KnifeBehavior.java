package shejimoshi.策略模式;

class KnifeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("实现用匕首刺杀...");
    }
}