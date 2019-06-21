package fantasyGame.Enums;

public enum SpellType {

    LIGHTNING(15),
    FIREBALL(30),
    FROSTBOLT(20);

    private final int value;

    SpellType(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
