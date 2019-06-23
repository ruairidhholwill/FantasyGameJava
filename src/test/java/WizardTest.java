import fantasyGame.Enums.CreatureType;
import fantasyGame.Enums.SpellType;
import fantasyGame.Enums.WeaponType;
import fantasyGame.character.enemy.Enemy;
import fantasyGame.character.enemy.Ogre;
import fantasyGame.character.mage.Wizard;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class WizardTest {

    Wizard wizard;
    Enemy enemy;

    @Before
    public void before(){
        wizard = new Wizard("Harry", 100, SpellType.FIREBALL, CreatureType.DRAGON, 40);
        enemy = new Ogre("Ogre", 100, WeaponType.CLUB);
    }

    @Test
    public void canGetName(){
        assertEquals("Harry", wizard.getName());
    }

    @Test
    public void canGetHealth(){
        assertEquals(100, wizard.getHealth());
    }

    @Test
    public void canGetSpellType(){
        assertEquals(SpellType.FIREBALL, wizard.getSpellType());
    }

    @Test
    public void canChangeSpellType(){
        wizard.setSpellType(SpellType.FROSTBOLT);
        assertEquals(SpellType.FROSTBOLT, wizard.getSpellType());
    }

    @Test
    public void canGetCreatureType(){
        assertEquals(CreatureType.DRAGON, wizard.getCreatureType());
    }

    @Test
    public void canChangeCreatureType(){
        wizard.setCreatureType(CreatureType.TROLL);
        assertEquals(CreatureType.TROLL, wizard.getCreatureType());
    }

    @Test
    public void canGetPower(){
        assertEquals(40, wizard.getPower());
    }

    @Test
    public void creatureCanDefend(){
        wizard.defend(enemy);
        assertEquals(40, enemy.getHealth());
    }
}
