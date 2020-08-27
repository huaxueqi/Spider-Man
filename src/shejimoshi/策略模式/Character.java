package shejimoshi.策略模式;

public abstract class Character {
    // 将接口作为抽象角色的Field以便封装
    protected WeaponBehavior weaponBehavior;

    public void setWeapon(WeaponBehavior w) {
        weaponBehavior = w;
    }

    /**
     * 这里有点类似“代理模式”
     */
    public void performWeapon() {
        // do something...
        weaponBehavior.useWeapon();
        // do something...
    }

    public abstract void fight();
}
