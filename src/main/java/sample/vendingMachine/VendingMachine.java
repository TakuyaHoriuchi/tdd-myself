package sample.vendingMachine;

import java.util.List;
import java.util.ArrayList;


public class VendingMachine {
    private int total = 0;
    private List<Juice> juices;

    public void VendingMachine() {
        this.juices =  new ArrayList();
        this.juices.add(new Juice());
        this.juices.add(new Juice());
        this.juices.add(new Juice());
        this.juices.add(new Juice());
        this.juices.add(new Juice());
    }

    int getTotal(){
        return total;
    }
    
    YEN insertCoin(YEN yen) {
        if (isAvailable(yen)) {
            total += yen.getNum();
            return null;
        } else {
            return yen;
        }
    }
    
    int returnMoney() {
        int tmp = total;
        total = 0;
        return tmp;
    }
    
    List<Juice> getJuice(){
        return this.juices;
    }
    
    void insertJuice(Juice juice) {
        this.juices.add(juice);
    }
    
    boolean isAvailable(YEN yen){
        List<YEN> availble = List.of(
            YEN.TEN,
            YEN.FIFTY,
            YEN.HUNDRED,
            YEN.FIVE_HUNDRED,
            YEN.THOUSAND
            );
        return availble.contains(yen);
    }
}
