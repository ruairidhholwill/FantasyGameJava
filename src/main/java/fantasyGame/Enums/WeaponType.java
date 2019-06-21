package fantasyGame.Enums;

public enum WeaponType {

    AXE(20),
    SWORD(25),
    CLUB(30);

    private final int value;

    WeaponType(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}


