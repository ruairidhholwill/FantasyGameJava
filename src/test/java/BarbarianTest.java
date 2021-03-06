import fantasyGame.Enums.WeaponType;
import fantasyGame.character.enemy.Enemy;
import fantasyGame.character.enemy.Ogre;
import fantasyGame.character.fighter.Barbarian;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BarbarianTest {

    Barbarian barbarian;
    Enemy enemy;

    @Before
    public void before(){
        barbarian = new Barbarian("Odrin", 100, WeaponType.CLUB, 20, 30);
        enemy = new Ogre("Ogre", 100, WeaponType.CLUB);

    }

    @Test
    public void canGetName(){
        assertEquals("Odrin", barbarian.getName());
    }

    @Test
    public void canGetHealth(){
        assertEquals(100, barbarian.getHealth());
    }

    @Test
    public void canGetWeapon(){
        assertEquals(WeaponType.CLUB, barbarian.getWeaponType());
    }

    @Test
    public void canChangeWeapon(){
        barbarian.setWeaponType(WeaponType.AXE);
        assertEquals(WeaponType.AXE, barbarian.getWeaponType());
    }

    @Test
    public void getWeaponValue(){
        assertEquals(30, barbarian.getWeaponValue());
    }

    @Test
    public void canGetPower(){
        assertEquals(20, barbarian.getPower());
    }

    @Test
    public void canGetShield(){
        assertEquals(30, barbarian.getShield());
    }

    @Test
    public void canAttackWithExtraPower(){
        barbarian.attack(enemy);
        assertEquals(50, enemy.getHealth());
    }

    @Test
    public void shieldReducesDamage(){
        enemy.attack(barbarian);
        assertEquals(100, barbarian.getHealth());
    }

}
