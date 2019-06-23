package fantasyGame.character.cleric;

import fantasyGame.Enums.HealType;
import fantasyGame.behaviours.IHeal;
import fantasyGame.character.Character;
import fantasyGame.character.fighter.Fighter;

public class Healer extends Character implements IHeal {

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

    public void heal(Fighter fighter){
        int health = healType.getValue();
        fighter.increaseHealth(health);
    }
}
