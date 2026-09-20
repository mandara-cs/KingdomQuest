public class Wizard extends Player {
    public Wizard(String name) {
        super(name, 60, 1);
    }

    @Override
    public void attack(Battleable target) {
        Weapon eq = getInventory().getEquippedWeapon();
        int totalDamage = 15 + eq.getDamage(); // High magic base damage
        System.out.println(getName() + " casts a spell on " + target.getName() + " with " + eq.getName() + "!");
        target.takeDamage(totalDamage);
    }

    @Override
    public void specialAbility() {
        System.out.println(getName() + " uses Fireball!");
    }
}