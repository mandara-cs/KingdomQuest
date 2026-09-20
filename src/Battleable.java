// OOP Concept: Interface (Abstraction)
// Defines a contract that any combat-ready entity must follow.
public interface Battleable {
    void attack(Battleable target);
    void takeDamage(int damage);
    int getHealth();
    String getName();
    boolean isAlive();
}
