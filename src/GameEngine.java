public class GameEngine {
    
    public static void main(String[] args) {
        System.out.println("=== KINGDOM QUEST ADVENTURE GAME ===");
        
        // MODULE: Character Management & Overloading setup
        Player hero = new Warrior("Arthur");
        
        // MODULE: Inventory Management & Exception Handling Demo
        System.out.println("\n--- Setting up Inventory ---");
        hero.getInventory().addWeapon(new Weapon("Excalibur", 25));
        hero.getInventory().addWeapon(new Weapon("Iron Dagger", 5));
        hero.getInventory().addWeapon(new Weapon("Wooden Shield", 2));
        hero.getInventory().addWeapon(new Weapon("Extra Sword", 10)); // Will trigger try-catch

        // MODULE: Battle Simulation (Arrays & Flow Controls)
        System.out.println("\n--- Battle Begins ---");
        
        // OOP Concept: Arrays of Objects & Polymorphism
        Enemy[] enemies = new Enemy[2];
        enemies[0] = new Goblin();
        enemies[1] = new Dragon();

        // Flow Control: Loop through enemies
        for (int i = 0; i < enemies.length; i++) {
            Enemy currentEnemy = enemies[i];
            System.out.println("\nA wild " + currentEnemy.getName() + " appears!");
            
            // Flow Control: While loop for combat
            while (hero.isAlive() && currentEnemy.isAlive()) {
                
                hero.attack(currentEnemy);
                
                // Flow Control: Conditional Check
                if (currentEnemy.isAlive()) {
                    currentEnemy.attack(hero);
                }
            }
            
            if (hero.isAlive()) {
                System.out.println(">> " + hero.getName() + " defeated the " + currentEnemy.getName() + "!\n");
            } else {
                System.out.println(">> Game Over. " + hero.getName() + " was defeated.");
                break; // Exit game loop if hero dies
            }
        }
        
        if(hero.isAlive()) {
            System.out.println("Congratulations! " + hero.getName() + " has cleared the dungeon!");
            hero.specialAbility(); // Demonstrating abstract method call
        }
    }
}