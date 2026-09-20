public class Archer extends Player {
    public Archer(String name) {
        super(name, 80, 1);
    }

    @Override
    public void attack(Battleable target) {
        Weapon eq = getInventory().getEquippedWeapon();
        int totalDamage = 8 + eq.getDamage();
        System.out.println(getName() + " shoots " + target.getName() + " using " + eq.getName() + "!");
        target.takeDamage(totalDamage);
    }

    @Override
    public void specialAbility() {
        System.out.println(getName() + " uses Piercing Arrow!");
    }
}