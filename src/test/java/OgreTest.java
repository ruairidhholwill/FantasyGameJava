import fantasyGame.Enums.WeaponType;
import fantasyGame.character.enemy.Enemy;
import fantasyGame.character.enemy.Ogre;
import fantasyGame.character.fighter.Dwarf;
import fantasyGame.character.fighter.Fighter;
import fantasyGame.character.fighter.Knight;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class OgreTest {

    Ogre ogre;
    Fighter fighter;

    @Before
    public void before(){
        ogre = new Ogre("Ogre", 100, WeaponType.CLUB);
        fighter = new Dwarf("Lancelot", 100, WeaponType.SWORD, 20);
    }

    @Test
    public void canGetName(){
        assertEquals("Ogre", ogre.getName());
    }

    @Test
    public void canGetHealth(){
        assertEquals(100, ogre.getHealth());
    }

    @Test
    public void canGetWeaponType(){
        assertEquals(WeaponType.CLUB, ogre.getWeaponType());
    }

    @Test
    public void canTakeDamage(){
        ogre.reduceHealth(50);
        assertEquals(50, ogre.getHealth());
    }

    @Test
    public void canAttackFighter(){
        ogre.attack(fighter);
        assertEquals(70, fighter.getHealth());
    }
}
