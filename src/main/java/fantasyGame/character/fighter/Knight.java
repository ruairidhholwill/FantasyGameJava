package fantasyGame.character.fighter;

import fantasyGame.Enums.WeaponType;

public class Knight extends Fighter {

    private int shield;

    public Knight(String name, int health, WeaponType weaponType, int shield) {
        super(name, health, weaponType);
        this.shield = shield;
    }

    public int getShield() {
        return shield;
    }
}
