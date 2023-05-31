package Raffle;

public class Main {
    public static void main(String[] args) {
        Raffle raffle = new Raffle(500);

        raffle.register("Participant 1");
        raffle.register("Participant 2");
        raffle.register("Participant 3");
        raffle.register("Participant 4");
        raffle.register("Participant 5");

        raffle.start();
    }
}



