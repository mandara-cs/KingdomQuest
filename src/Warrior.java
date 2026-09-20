// OOP Concept: Inheritance (IS-A Relationship)
public class Warrior extends Player {
    
    public Warrior(String name) {
        super(name, 100, 1);
    }

    // OOP Concept: Polymorphism (Method Overriding)
    @Override
    public void attack(Battleable target) {
        Weapon eq = getInventory().getEquippedWeapon();
        int totalDamage = 10 + eq.getDamage(); // Base strength + weapon
        System.out.println(getName() + " strikes " + target.getName() + " with " + eq.getName() + "!");
        target.takeDamage(totalDamage);
    }

    @Override
    public void specialAbility() {
        System.out.println(getName() + " uses Shield Bash!");
    }
}