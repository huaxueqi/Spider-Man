package shejimoshi.策略模式;

class King extends Character {

    public King() {
        weaponBehavior = new SwordBehavior();
    }

    @Override
    public void fight() {
        System.out.println("国王使用宝剑挥舞...");
    }

}