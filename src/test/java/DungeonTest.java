import fantasyGame.Enums.CreatureType;
import fantasyGame.Enums.HealType;
import fantasyGame.Enums.SpellType;
import fantasyGame.Enums.WeaponType;
import fantasyGame.character.cleric.Healer;
import fantasyGame.character.enemy.Enemy;
import fantasyGame.character.enemy.Ogre;
import fantasyGame.character.enemy.Orc;
import fantasyGame.character.fighter.Barbarian;
import fantasyGame.character.fighter.Dwarf;
import fantasyGame.character.fighter.Fighter;
import fantasyGame.character.fighter.Knight;
import fantasyGame.character.mage.Mage;
import fantasyGame.character.mage.Wizard;
import fantasyGame.room.Dungeon;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class DungeonTest {

    Dungeon dungeon;
    Enemy orc;
    Enemy ogre;
    Fighter knight;
    Fighter dwarf;
    Fighter barbarian;
    Mage mage;
    Healer healer;
    ArrayList<Enemy> enemies;
    ArrayList<Fighter> fighters;

    @Before
    public void before(){
        orc = new Orc("Orc", 100, WeaponType.CLUB);
        ogre = new Ogre("Ogre", 100, WeaponType.AXE);
        knight = new Knight("Lancelot", 100, WeaponType.SWORD, 20);
        dwarf = new Dwarf("Tim", 100, WeaponType.AXE, 30);
        barbarian = new Barbarian("John", 100, WeaponType.CLUB, 20, 10);
        mage = new Wizard("Harry", 100, SpellType.LIGHTNING, CreatureType.DRAGON, 20);
        healer = new Healer("Doctor", 100, HealType.HERBS);
        enemies = new ArrayList<Enemy>();
        fighters = new ArrayList<Fighter>();
        dungeon = new Dungeon("Dungeon", enemies, fighters, mage, healer );
    }

    @Test
    public void canGetName(){
        assertEquals("Dungeon", dungeon.getName());
    }

    @Test
    public void enemiesStartEmpty(){
        assertEquals(0, enemies.size());
    }

    @Test
    public void fightersStartEmpty(){
        assertEquals(0, fighters.size());
    }

    @Test
    public void canAddEnemyToRoom(){
        enemies.add(ogre);
        assertEquals(1, enemies.size());
    }

    @Test
    public void canAddFighterToRoom(){
        fighters.add(knight);
        fighters.add(barbarian);
        assertEquals(2, fighters.size());
    }

    

}
