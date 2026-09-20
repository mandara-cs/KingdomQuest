public class Goblin extends Enemy {
    public Goblin() {
        super("Sneaky Goblin", 40, 5);
    }

    @Override
    public void attack(Battleable target) {
        System.out.println(getName() + " scratches " + target.getName() + "!");
        target.takeDamage(getBaseDamage());
    }
}