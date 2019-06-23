package fantasyGame.character.mage;

import fantasyGame.Enums.CreatureType;
import fantasyGame.Enums.SpellType;

public class Witch extends Mage {

    private int shield;

    public Witch(String name, int health, SpellType spellType, CreatureType creatureType, int shield) {
        super(name, health, spellType, creatureType);
        this.shield = shield;
    }

    public int getShield() {
        return shield;
    }
}
