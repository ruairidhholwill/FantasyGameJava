package fantasyGame.character.mage;

import fantasyGame.Enums.CreatureType;
import fantasyGame.Enums.SpellType;
import fantasyGame.character.enemy.Enemy;

public class Warlock extends Mage {

    private int power;
    private int shield;

    public Warlock(String name, int health, SpellType spellType, CreatureType creatureType, int power, int shield) {
        super(name, health, spellType, creatureType);
        this.power = power;
        this.shield = shield;
    }

    public int getPower() {
        return power;
    }

    public int getShield() {
        return shield;
    }

    public void cast(Enemy enemy){
        int damage = this.getSpellType().getValue() + this.power;
        enemy.reduceHealth(damage);
    }
}
