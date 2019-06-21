package fantasyGame.character.fighter;

import fantasyGame.Enums.WeaponType;

public class Dwarf extends Fighter {

    private int power;

    public Dwarf(String name, int health, WeaponType weaponType, int power) {
        super(name, health, weaponType);
        this.power = power;
    }

    public int getPower() {
        return power;
    }
}
