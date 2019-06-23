package fantasyGame.character;

public abstract class Character {

   private String name;
   protected int health;

    public Character(String name, int health){
        this.name = name;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int reduceHealth(int damage) {
        return this.health -= damage;
    }

    public int increaseHealth(int health) {
        return this.health += health;
    }
}
