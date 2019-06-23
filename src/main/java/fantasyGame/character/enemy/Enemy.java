package fantasyGame.character.enemy;

import fantasyGame.Enums.WeaponType;
import fantasyGame.character.Character;

public abstract class Enemy extends Character {

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
}
