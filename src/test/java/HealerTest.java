import fantasyGame.Enums.HealType;
import fantasyGame.Enums.WeaponType;
import fantasyGame.character.cleric.Healer;
import fantasyGame.character.fighter.Fighter;
import fantasyGame.character.fighter.Knight;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class HealerTest {

    Healer healer;
    Fighter fighter;

    @Before
    public void before(){
        healer = new Healer("Tim", 100, HealType.POTION);
        fighter = new Knight("Lancelot", 30, WeaponType.SWORD, 20);
    }

    @Test
    public void canGetName(){
        assertEquals("Tim", healer.getName());
    }

    @Test
    public void canGetHealth(){
        assertEquals(100, healer.getHealth());
    }

    @Test
    public void canGetHealType(){
        assertEquals(HealType.POTION, healer.getHealType());
    }

    @Test
    public void canChangeHealType(){
        healer.setHealType(HealType.HERBS);
        assertEquals(HealType.HERBS, healer.getHealType());
    }

    @Test
    public void canHealFighter(){
        healer.heal(fighter);
        assertEquals(90, fighter.getHealth());
    }
}
