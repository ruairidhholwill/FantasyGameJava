package fantasyGame.character.fighter;

import fantasyGame.Enums.WeaponType;
import fantasyGame.character.Character;

public abstract class Fighter extends Character {

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
}
