import fantasyGame.Enums.WeaponType;
import fantasyGame.character.fighter.Dwarf;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DwarfTest {

    Dwarf dwarf;

    @Before
    public void before(){
        dwarf = new Dwarf("Dopey", 100, WeaponType.CLUB, 40);
    }

    @Test
    public void canGetName(){
        assertEquals("Dopey", dwarf.getName());
    }

    @Test
    public void canGetHealth(){
        assertEquals(100, dwarf.getHealth());
    }

    @Test
    public void canGetWeapon(){
        assertEquals(WeaponType.CLUB, dwarf.getWeaponType());
    }

    @Test
    public void canChangeWeapon(){
        dwarf.setWeaponType(WeaponType.AXE);
        assertEquals(WeaponType.AXE, dwarf.getWeaponType());
    }

    @Test
    public void getWeaponValue(){
        assertEquals(30, dwarf.getWeaponValue());
    }

    @Test
    public void canGetPower(){
        assertEquals(40, dwarf.getPower());
    }


}
