package fantasyGame.Enums;

public enum CreatureType {

    DRAGON(60),
    TROLL(30),
    LEMUR(20);

    private final int value;

    CreatureType(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
