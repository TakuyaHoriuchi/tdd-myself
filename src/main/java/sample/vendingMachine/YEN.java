package sample.vendingMachine;

public enum YEN {

    TEN(10),
    FIFTY(50),
    HUNDRED(100),
    FIVE_HUNDRED(500),
    THOUSAND(1000),
    ONE(1), FIVE(5),
    FIVE_THOUSAND(5000),
    TEN_THOUSAND(10000),
    TWO_THOUSAND(2000);

    private int num;

    YEN(int num) {
        this.num = num;
    }

    public int getNum() {
        return this.num;
    }
}
