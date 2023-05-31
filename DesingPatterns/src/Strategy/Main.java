package Strategy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        CardPaymentStrategy cardPaymentStrategy = new CardPaymentStrategy(
                "Armen Makaryan",
                "4578 0069 6573 9355",
                469,
                "08/27"
        );

        IDramPaymentStrategy iDramPaymentStrategy = new IDramPaymentStrategy("+37491177578");

        Product blender = new Product("Blender", 65000);
        Product phone = new Product("Iphone", 570000);

        CartService cartService = new CartService();
        cartService.add(blender);
        cartService.add(phone);

        Scanner scanner = new Scanner(System.in);
        String type = scanner.next();

        switch (type) {
            case "CARD" -> cartService.pay(cardPaymentStrategy);
            case "IDRAM" -> cartService.pay(iDramPaymentStrategy);
        }
    }
}