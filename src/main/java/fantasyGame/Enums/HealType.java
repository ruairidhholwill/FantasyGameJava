package fantasyGame.Enums;

public enum HealType {

    POTION(60),
    HERBS(50);

    private final int value;

    HealType(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
