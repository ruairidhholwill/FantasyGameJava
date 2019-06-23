package fantasyGame.character.fighter;

import fantasyGame.Enums.WeaponType;
import fantasyGame.behaviours.IAttackEnemy;
import fantasyGame.character.Character;
import fantasyGame.character.enemy.Enemy;

public abstract class Fighter extends Character implements IAttackEnemy {

    WeaponType weaponType;

    public Fighter(String name, int health, WeaponType weaponType){
        super(name, health);
        this.weaponType = weaponType;
    }

    public WeaponType getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(WeaponType weaponType) {
        this.weaponType = weaponType;
    }

    public int getWeaponValue(){
        return weaponType.getValue();
    }

    public void attack(Enemy enemy){
        int damage = weaponType.getValue();
        enemy.reduceHealth(damage);
    }



}
