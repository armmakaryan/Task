package Strategy;

import java.util.ArrayList;
import java.util.List;

public class CartService {

    private List<Product> products = new ArrayList<>();

    public void add(Product product) {
        this.products.add(product);
    }
    public void remove(Product product) {
        this.products.remove(product);
    }

    private int calculateTotalAmount(){
        return products.stream()
                .map(Product::getPrice)
                .reduce(Integer::sum)
                .orElse(0);
    }

    public void pay(PaymentStrategy paymentStrategy) {
        int price = calculateTotalAmount();
        System.out.println("payment started: " + price);
        paymentStrategy.pay(price);
        System.out.println(" payment done.");
    }

}
