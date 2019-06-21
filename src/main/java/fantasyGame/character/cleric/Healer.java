package fantasyGame.character.cleric;

import fantasyGame.Enums.HealType;
import fantasyGame.character.Character;

public class Healer extends Character {

    private HealType healType;

    public Healer(String name, int health, HealType healType){
        super(name, health);
        this.healType = healType;
    }

    public HealType getHealType() {
        return healType;
    }

    public void setHealType(HealType healType) {
        this.healType = healType;
    }
}
