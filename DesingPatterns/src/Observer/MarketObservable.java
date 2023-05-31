package Observer;

import java.util.ArrayList;
import java.util.List;

public class MarketObservable implements Observable{

    private List<Observer> observers = new ArrayList<>();


    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unRegister(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        observers.forEach(observer -> observer.update("Phone already exists"));
    }
}
