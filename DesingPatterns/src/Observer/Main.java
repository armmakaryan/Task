package Observer;

public class Main {

    public static void main(String[] args) {
        MarketSubscriber sub1 = new MarketSubscriber("Sub1");
        MarketSubscriber sub2 = new MarketSubscriber("Sub2");
        MarketSubscriber sub3 = new MarketSubscriber("Sub3");
        MarketSubscriber sub4 = new MarketSubscriber("Sub4");
        MarketSubscriber sub5 = new MarketSubscriber("Sub5");

        MarketObservable marketObservable = new MarketObservable();
        marketObservable.register(sub1);
        marketObservable.register(sub2);
        marketObservable.register(sub3);
        marketObservable.register(sub4);
        marketObservable.register(sub5);

        marketObservable.notifySubscribers();

        System.out.println("---------------------------");

        marketObservable.unRegister(sub1);
        marketObservable.unRegister(sub4);

        marketObservable.notifySubscribers();

    }

}
