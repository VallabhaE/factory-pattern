import Observer.MobileAlert;
import Observer.NotificationAlertObserver;
import oBSERVABLE.IphoneObservableImplementation;
import oBSERVABLE.StocksObservable;

public class  Main {
    public static void main(String[] args) {
        StocksObservable iphone = new IphoneObservableImplementation();
        NotificationAlertObserver iphone0 = new MobileAlert("eswar,",iphone);
        NotificationAlertObserver iphone1 = new MobileAlert("vallabha,",iphone);

        NotificationAlertObserver iphone2 = new MobileAlert("Rama,",iphone);

        iphone.add(iphone0);
        iphone.add(iphone1);
        iphone.add(iphone2);


        iphone.SetStocksAvailable(10);
        iphone.SetStocksAvailable(11);




    }
}

