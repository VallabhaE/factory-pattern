package oBSERVABLE;

import Observer.NotificationAlertObserver;

public interface StocksObservable {
    public void add(NotificationAlertObserver ob);
    public void remove(NotificationAlertObserver ob);
    public void Notify();
    public void SetStocksAvailable(int TotalStocks);
}
