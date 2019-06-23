import fantasyGame.Enums.WeaponType;
import fantasyGame.character.enemy.Ogre;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class OgreTest {

    Ogre ogre;

    @Before
    public void before(){
        ogre = new Ogre("Ogre", 100, WeaponType.CLUB);
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
}
