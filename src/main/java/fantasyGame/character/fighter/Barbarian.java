package fantasyGame.character.fighter;

import fantasyGame.Enums.WeaponType;

public class Barbarian extends Fighter {

    private int power;
    private int shield;

    public Barbarian(String name, int health, WeaponType weaponType, int power, int shield) {
        super(name, health, weaponType);
        this.power = power;
        this.shield = shield;
    }

    public int getPower() {
        return power;
    }

    public int getShield() {
        return shield;
    }
}
