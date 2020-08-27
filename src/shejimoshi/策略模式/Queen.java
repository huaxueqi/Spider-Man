package shejimoshi.策略模式;

class Queen extends Character {

    public Queen() {
        weaponBehavior = new KnifeBehavior();
    }

    @Override
    public void fight() {
        System.out.println("皇后使用匕首刺杀...");
    }

}