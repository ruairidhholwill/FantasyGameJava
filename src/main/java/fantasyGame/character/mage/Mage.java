package fantasyGame.character.mage;

import fantasyGame.Enums.CreatureType;
import fantasyGame.Enums.SpellType;
import fantasyGame.behaviours.ICast;
import fantasyGame.behaviours.IDefend;
import fantasyGame.character.Character;
import fantasyGame.character.enemy.Enemy;

public abstract class Mage extends Character implements ICast, IDefend {

    private SpellType spellType;
    private CreatureType creatureType;

    public Mage(String name, int health, SpellType spellType, CreatureType creatureType){
        super(name, health);
        this.creatureType = creatureType;
        this.spellType = spellType;
    }


    public SpellType getSpellType() {
        return spellType;
    }

    public void setSpellType(SpellType spellType) {
        this.spellType = spellType;
    }

    public CreatureType getCreatureType() {
        return creatureType;
    }

    public void setCreatureType(CreatureType creatureType) {
        this.creatureType = creatureType;
    }

    public void cast(Enemy enemy){
        int damage = spellType.getValue();
        enemy.reduceHealth(damage);
    }

    public void defend(Enemy enemy){
        int damage = creatureType.getValue();
        enemy.reduceHealth(damage);
    }
}
