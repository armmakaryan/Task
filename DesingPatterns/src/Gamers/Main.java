package Gamers;

public class Main {
    public static void main(String[] args) {
        Gamer1 gamer1 = new Gamer1(2000, 250);
        Gamer2 gamer2 = new Gamer2(1500, 500);

        while (true) {
            int attack = gamer1.attack(gamer2);
            if (attack == 1) {
                break;
            }
            int attack1 = gamer2.attack(gamer1);
            if (attack1==1){
                break;
            }
        }
    }
}

