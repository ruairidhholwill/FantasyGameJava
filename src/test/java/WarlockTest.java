import fantasyGame.Enums.CreatureType;
import fantasyGame.Enums.SpellType;
import fantasyGame.character.mage.Warlock;
import org.junit.Before;
import org.junit.Test;
import sun.util.resources.sr.CurrencyNames_sr_Latn_RS;

import static junit.framework.TestCase.assertEquals;

public class WarlockTest {

    Warlock warlock;

    @Before
    public void before(){
        warlock = new Warlock("Ben", 100, SpellType.FROSTBOLT, CreatureType.LEMUR, 20, 15);
    }

    @Test
    public void canGetName(){
        assertEquals("Ben", warlock.getName());
    }

    @Test
    public void canGetHealth(){
        assertEquals(100, warlock.getHealth());
    }

    @Test
    public void canGetSpellType(){
        assertEquals(SpellType.FROSTBOLT, warlock.getSpellType());
    }

    @Test
    public void canChangeSpellType(){
        warlock.setSpellType(SpellType.FIREBALL);
        assertEquals(SpellType.FIREBALL, warlock.getSpellType());
    }

    @Test
    public void canGetCreatureType(){
        assertEquals(CreatureType.LEMUR, warlock.getCreatureType());
    }

    @Test
    public void canChangeCreatureType(){
        warlock.setCreatureType(CreatureType.DRAGON);
        assertEquals(CreatureType.DRAGON, warlock.getCreatureType());
    }

    @Test
    public void canGetPower(){
        assertEquals(20, warlock.getPower());
    }

    @Test
    public void canGetShield(){
        assertEquals(15, warlock.getShield());
    }
}
