// OOP Concept: Abstract Class & Interface Implementation
public abstract class Player implements Battleable {
    private String name;
    private int health;
    private int level;
    
    // OOP Concept: HAS-A Relationship (Composition/Aggregation)
    private Inventory inventory; 

    public Player(String name, int health, int level) {
        this.name = name;
        this.health = health;
        this.level = level;
        this.inventory = new Inventory(3); // Player has a 3-slot inventory
    }

    public Inventory getInventory() { return inventory; }
    
    @Override
    public String getName() { return name; }
    
    @Override
    public int getHealth() { return health; }

    @Override
    public void takeDamage(int damage) {
        this.health -= damage;
        if (this.health < 0) this.health = 0;
        System.out.println(this.name + " takes " + damage + " damage. Health is now " + this.health);
    }

    @Override
    public boolean isAlive() { return this.health > 0; }
    
    // Abstract method forcing subclasses to define specific attack logic
    public abstract void specialAbility();
}