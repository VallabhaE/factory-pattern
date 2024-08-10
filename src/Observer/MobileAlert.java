package Observer;

import oBSERVABLE.IphoneObservableImplementation;
import oBSERVABLE.StocksObservable;

public class MobileAlert implements NotificationAlertObserver  {
    String s;
    StocksObservable a;
    public MobileAlert (String s, StocksObservable a){
        this.s = s;
        this.a = a;
    }
    @Override
    public void update() {
        System.out.println("Data has been sent to mobile");
    }
}
