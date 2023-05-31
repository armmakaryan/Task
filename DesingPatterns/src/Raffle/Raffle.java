package Raffle;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Raffle {
        private int limit;
        private List<String> participants = new ArrayList<>();

        public Raffle(int limit) {
            this.limit = limit;
        }

        public void register(String participant) {
            participants.add(participant);
        }

        public void start() {
            if (participants.isEmpty()) {
                System.out.println("No participants registered for the raffle.");
                return;
            }

            Random random = new Random();
            int randomNumber = random.nextInt(1001);

            List<String> winners = new ArrayList<>();
            for (String participant : participants) {
                if (participant.hashCode() < randomNumber) {
                    winners.add(participant);
                }
            }

            if (winners.isEmpty()) {
                System.out.println("No winners this time. Try again next time!");
            } else {
                int randomIndex = random.nextInt(winners.size());
                String winner = winners.get(randomIndex);
                System.out.println("The winner is: " + winner);

                for (String participant : participants) {
                    if (participant.equals(winner)) {
                        System.out.println("Notification sent to the winner: Congratulations!");
                    } else {
                        System.out.println("Notification sent to participant: Try again next time.");
                    }
                }
            }
        }
    }


