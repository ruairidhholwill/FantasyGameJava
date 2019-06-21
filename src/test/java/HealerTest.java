import fantasyGame.Enums.HealType;
import fantasyGame.character.cleric.Healer;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class HealerTest {

    Healer healer;

    @Before
    public void before(){
        healer = new Healer("Tim", 100, HealType.POTION);
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
}
