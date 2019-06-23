import fantasyGame.Enums.CreatureType;
import fantasyGame.Enums.SpellType;
import fantasyGame.Enums.WeaponType;
import fantasyGame.character.enemy.Enemy;
import fantasyGame.character.enemy.Orc;
import fantasyGame.character.mage.Witch;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class WitchTest {

    Witch witch;
    Enemy enemy;

    @Before
    public void before(){
        witch = new Witch("Hermoine", 100, SpellType.LIGHTNING, CreatureType.TROLL, 40);
        enemy = new Orc("Orc", 100, WeaponType.SWORD);
    }

    @Test
    public void canGetName(){
        assertEquals("Hermoine", witch.getName());
    }

    @Test
    public void canGetHealth(){
        assertEquals(100, witch.getHealth());
    }

    @Test
    public void canGetSpellType(){
        assertEquals(SpellType.LIGHTNING, witch.getSpellType());
    }

    @Test
    public void canChangeSpellType(){
        witch.setSpellType(SpellType.FIREBALL);
        assertEquals(SpellType.FIREBALL, witch.getSpellType());
    }

    @Test
    public void canGetCreatureType(){
        assertEquals(CreatureType.TROLL, witch.getCreatureType());
    }

    @Test
    public void canChangeCreatureType(){
        witch.setCreatureType(CreatureType.DRAGON);
        assertEquals(CreatureType.DRAGON, witch.getCreatureType());
    }

    @Test
    public void canGetShield(){
        assertEquals(40, witch.getShield());
    }

    @Test
    public void canAttackEnemy(){
        witch.cast(enemy);
        assertEquals(85, enemy.getHealth());
    }

}
