package fantasyGame.character.enemy;

import fantasyGame.Enums.WeaponType;
import fantasyGame.behaviours.IAttackEnemy;
import fantasyGame.behaviours.IAttackFighter;
import fantasyGame.character.Character;
import fantasyGame.character.fighter.Fighter;

public abstract class Enemy extends Character implements IAttackFighter {

    private WeaponType weaponType;

    public Enemy(String name, int health, WeaponType weaponType) {
        super(name, health);
        this.weaponType = weaponType;
    }

    public WeaponType getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(WeaponType weaponType) {
        this.weaponType = weaponType;
    }

    public void attack(Fighter fighter){
        int damage = weaponType.getValue();
        fighter.reduceHealth(damage);
    }


}
