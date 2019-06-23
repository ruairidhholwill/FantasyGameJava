package fantasyGame.character.mage;

import fantasyGame.Enums.CreatureType;
import fantasyGame.Enums.SpellType;
import fantasyGame.character.enemy.Enemy;

public class Wizard extends Mage {

    private int power;

    public Wizard(String name, int health, SpellType spellType, CreatureType creatureType, int power) {
        super(name, health, spellType, creatureType);
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public void cast(Enemy enemy){
        int damage = this.getSpellType().getValue() + this.power;
        enemy.reduceHealth(damage);
    }
}
