package sample;

public abstract class Coin {

    protected Coin(Short value) {
        this.value = value;
    }

    private Short value;

    public Short getValue() {
        return value;
    }

}
