public class Dragon extends Enemy {
    public Dragon() {
        super("Fire Dragon", 150, 20);
    }

    @Override
    public void attack(Battleable target) {
        System.out.println(getName() + " breathes fire on " + target.getName() + "!");
        target.takeDamage(getBaseDamage());
    }
}