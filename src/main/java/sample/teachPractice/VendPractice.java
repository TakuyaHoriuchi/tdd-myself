package sample.teachPractice;

import java.util.List;

public class VendPractice {

    private int summaryMoney = 0;

    public YEN insertMoney(YEN yen) {
        if (!isAvailable(yen)) {
            return yen;
        }

        summaryMoney += yen.getNum();
        return null;
    }

    private boolean isAvailable(YEN yen) {
        List<YEN> available = List.of(
            YEN.TEN,
            YEN.FIFTY,
            YEN.HUNDRED,
            YEN.FIVE_HUNDRED,
            YEN.THOUSAND
        );
        return available.contains(yen);
    }

    public int viewDisplay() {
        return summaryMoney;
    }

    public int refund() {
        int refund = summaryMoney;
        summaryMoney = 0;
        return refund;
    }
}
