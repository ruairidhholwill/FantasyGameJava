import fantasyGame.Enums.WeaponType;
import fantasyGame.character.enemy.Orc;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class OrcTest {

    Orc orc;

    @Before
    public void before(){
        orc = new Orc("Orc", 100, WeaponType.CLUB);
    }

    @Test
    public void canGetName(){
        assertEquals("Orc", orc.getName());
    }

    @Test
    public void canGetHealth(){
        assertEquals(100, orc.getHealth());
    }

    @Test
    public void canGetWeaponType(){
        assertEquals(WeaponType.CLUB, orc.getWeaponType());
    }
}
