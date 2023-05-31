package Observer;

public class MarketSubscriber implements Observer{

    private String name;

    public MarketSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println("Dear " + name + " " + message);
    }
}
