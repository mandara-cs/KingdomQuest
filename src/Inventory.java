public class Inventory {
    // OOP Concept: Arrays & Encapsulation
    private Weapon[] weapons;
    private int weaponCount;

    public Inventory(int capacity) {
        super(); // Explicitly calls java.lang.Object constructor
        // Initializes array to store game objects
        this.weapons = new Weapon[capacity];
        this.weaponCount = 0;
    }

    // OOP Concept: Exception Handling (try-catch)
    public void addWeapon(Weapon weapon) {
        try {
            weapons[weaponCount] = weapon;
            weaponCount++;
            System.out.println("Added to inventory: " + weapon.getName());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Inventory is full! Cannot add " + weapon.getName());
        }
    }
    
    public Weapon getEquippedWeapon() {
        if (weaponCount > 0) {
            return weapons[0]; // Equip the first weapon for simplicity
        }
        return new Weapon(); // Returns default "Bare Hands"
    }
}