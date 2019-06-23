package fantasyGame.character.mage;

import fantasyGame.Enums.CreatureType;
import fantasyGame.Enums.SpellType;

public class Wizard extends Mage {

    private int power;

    public Wizard(String name, int health, SpellType spellType, CreatureType creatureType, int power) {
        super(name, health, spellType, creatureType);
        this.power = power;
    }

    public int getPower() {
        return power;
    }
}
