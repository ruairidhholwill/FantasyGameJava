package fantasyGame.character.fighter;

import fantasyGame.Enums.WeaponType;
import fantasyGame.behaviours.IAttackEnemy;
import fantasyGame.character.enemy.Enemy;

public class Barbarian extends Fighter implements IAttackEnemy {

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

    public void attack(Enemy enemy){
        int damage = weaponType.getValue() + this.getPower();
        enemy.reduceHealth(damage);
    }

    public int reduceHealth(int damage){
        return this.health -= (damage - this.getShield());
    }


}
