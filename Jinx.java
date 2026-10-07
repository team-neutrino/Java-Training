public class Jinx extends Character {
    private double attackRamp = 10;

    public Jinx() {
        super(100, 50);
    }

    public void attack(Character victim) {
        super.basicAttack(victim);
        super.increaseAttackPower(attackRamp);
    }
}
