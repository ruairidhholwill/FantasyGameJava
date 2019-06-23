package fantasyGame.room;

import fantasyGame.character.cleric.Healer;
import fantasyGame.character.enemy.Enemy;
import fantasyGame.character.fighter.Fighter;
import fantasyGame.character.mage.Mage;

import java.util.ArrayList;

public abstract class Room {

    private String name;
    private ArrayList<Enemy> enemies;
    private ArrayList<Fighter> fighters;
    private Mage mage;
    private Healer healer;

    public Room(String name, ArrayList<Enemy> enemies, ArrayList<Fighter> fighters, Mage mage, Healer healer){
        this.name = name;
        this.enemies = new ArrayList<Enemy>();
        this.fighters = new ArrayList<Fighter>();
        this.mage = mage;
        this.healer = healer;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Enemy> getEnemies() {
        return enemies;
    }

    public ArrayList<Fighter> getFighters() {
        return fighters;
    }

    public Mage getMage() {
        return mage;
    }

    public void setMage(Mage mage) {
        this.mage = mage;
    }

    public Healer getHealer() {
        return healer;
    }

    public void setHealer(Healer healer) {
        this.healer = healer;
    }
}
