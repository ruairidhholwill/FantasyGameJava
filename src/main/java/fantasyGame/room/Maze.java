package fantasyGame.room;

import fantasyGame.character.cleric.Healer;
import fantasyGame.character.enemy.Enemy;
import fantasyGame.character.fighter.Fighter;
import fantasyGame.character.mage.Mage;

import java.util.ArrayList;

public class Maze extends Room {
    public Maze(String name, ArrayList<Enemy> enemies, ArrayList<Fighter> fighters, Mage mage, Healer healer) {
        super(name, enemies, fighters, mage, healer);
    }
}
