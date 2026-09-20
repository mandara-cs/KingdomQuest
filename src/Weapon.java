public class Weapon {
    // OOP Concept: Encapsulation (Private attributes)
    private String name;
    private int damage;

    // OOP Concept: Method Overloading (Constructor overloading)
    // Default constructor
    public Weapon() {
        super(); // Explicitly calls java.lang.Object constructor
        this.name = "Bare Hands";
        this.damage = 1;
    }

    // Overloaded constructor
    public Weapon(String name, int damage) {
        super(); // Explicitly calls java.lang.Object constructor
        this.name = name;
        this.damage = damage;
    }
    
    // Encapsulation: Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getDamage() { return damage; }
    public void setDamage(int damage) { this.damage = damage; }
}