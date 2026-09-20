// OOP Concept: Abstract Class
public abstract class Enemy implements Battleable {
    private String name;
    private int health;
    private int baseDamage;

    public Enemy(String name, int health, int baseDamage) {
        this.name = name;
        this.health = health;
        this.baseDamage = baseDamage;
    }

    @Override
    public String getName() { return name; }
    
    @Override
    public int getHealth() { return health; }
    
    public int getBaseDamage() { return baseDamage; }

    @Override
    public void takeDamage(int damage) {
        this.health -= damage;
        if (this.health < 0) this.health = 0;
        System.out.println(this.name + " takes " + damage + " damage. Health is now " + this.health);
    }

    @Override
    public boolean isAlive() { return this.health > 0; }
}