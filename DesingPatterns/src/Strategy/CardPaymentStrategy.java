package Strategy;

public class CardPaymentStrategy implements PaymentStrategy{

    private String fullName;
    private String cardNumber;
    private int cvv;
    private String expDate;

    public CardPaymentStrategy(String fullName, String cardNumber, int cvv, String expDate) {
        this.fullName = fullName;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.expDate = expDate;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Payment success");
        System.out.println(fullName);
        System.out.println("You have paid : " + amount);
        System.out.println("From card ************" + cardNumber.substring(12));
    }
}
