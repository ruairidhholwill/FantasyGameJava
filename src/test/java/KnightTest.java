import fantasyGame.Enums.WeaponType;
import fantasyGame.character.enemy.Enemy;
import fantasyGame.character.enemy.Ogre;
import fantasyGame.character.fighter.Knight;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class KnightTest {

    Knight knight;
    Knight knight2;
    Enemy enemy;

    @Before
    public void before(){
        knight = new Knight("Lancelot", 100, WeaponType.SWORD, 40);
        knight2 = new Knight("Lancelot", 100, WeaponType.SWORD, 20);
        enemy = new Ogre("Ogre", 100, WeaponType.CLUB);
    }

    @Test
    public void canGetName(){
        assertEquals("Lancelot", knight.getName());
    }

    @Test
    public void canGetHealth(){
        assertEquals(100, knight.getHealth());
    }

    @Test
    public void canGetWeapon(){
        assertEquals(WeaponType.SWORD, knight.getWeaponType());
    }

    @Test
    public void canChangeWeapon(){
        knight.setWeaponType(WeaponType.AXE);
        assertEquals(WeaponType.AXE, knight.getWeaponType());
    }

    @Test
    public void getWeaponValue(){
        assertEquals(25, knight.getWeaponValue());
    }


    @Test
    public void canGetShield(){
        assertEquals(40, knight.getShield());
    }

    @Test
    public void canAttackEnemy(){
        knight.attack(enemy);
        assertEquals(75, enemy.getHealth());
    }

    @Test
    public void shieldReducesDamage(){
        enemy.attack(knight2);
        assertEquals(90, knight2.getHealth());
    }

    @Test
    public void healthCanNotBeLessThan0(){
        enemy.attack(knight2);
        enemy.attack(knight2);
        enemy.attack(knight2);
        enemy.attack(knight2);
        enemy.attack(knight2);
        enemy.attack(knight2);
        enemy.attack(knight2);
        enemy.attack(knight2);
        enemy.attack(knight2);
        enemy.attack(knight2);
        enemy.attack(knight2);
        assertEquals(0, knight2.getHealth());
    }
}
