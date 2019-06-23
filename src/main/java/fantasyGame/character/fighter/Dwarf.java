package fantasyGame.character.fighter;

import fantasyGame.Enums.WeaponType;
import fantasyGame.character.enemy.Enemy;

public class Dwarf extends Fighter {

    private int power;

    public Dwarf(String name, int health, WeaponType weaponType, int power) {
        super(name, health, weaponType);
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public void attack(Enemy enemy){
        int damage = weaponType.getValue() + this.getPower();
        enemy.reduceHealth(damage);
    }
}
