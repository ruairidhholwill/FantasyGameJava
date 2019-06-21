package fantasyGame.character.mage;

import fantasyGame.Enums.CreatureType;
import fantasyGame.Enums.SpellType;
import fantasyGame.character.Character;

public abstract class Mage extends Character {

    private SpellType spellType;
    private CreatureType creatureType;

    public Mage(String name, int health, SpellType spellType, CreatureType creatureType){
        super(name, health);
        this.creatureType = creatureType;
        this.spellType = spellType;
    }


}
