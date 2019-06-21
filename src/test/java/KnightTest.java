import fantasyGame.Enums.WeaponType;
import fantasyGame.character.fighter.Knight;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class KnightTest {

    Knight knight;

    @Before
    public void before(){
        knight = new Knight("Lancelot", 100, WeaponType.SWORD, 40);
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
}
