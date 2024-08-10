package oBSERVABLE;

import Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImplementation implements StocksObservable {
    List<NotificationAlertObserver> objList = new ArrayList<>();
    int totalAvailableStocks = 0;
    int totalNotify = 0;

    @Override
    public void add(NotificationAlertObserver ob) {
        objList.add(ob);
    }

    @Override
    public void remove(NotificationAlertObserver ob) {
        objList.remove(ob);
    }

    @Override
    public void Notify() {
        for(NotificationAlertObserver o :objList) o.update();
    }

    @Override
    public void SetStocksAvailable(int AvailableStocks) {
        if(this.totalAvailableStocks < AvailableStocks) {
            Notify();
            System.out.println("Total times data moved From Observable to Observer:            "+ ++totalNotify);
        }
        totalAvailableStocks = AvailableStocks;
    }
}
