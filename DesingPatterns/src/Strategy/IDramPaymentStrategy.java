package Strategy;

public class IDramPaymentStrategy implements PaymentStrategy{

    private String phone;

    public IDramPaymentStrategy(String phone) {
        this.phone = phone;
    }

    @Override
    public void pay(int amount) {
        System.out.printf("Paid with Idram %s : %d", phone, amount);
    }
}
