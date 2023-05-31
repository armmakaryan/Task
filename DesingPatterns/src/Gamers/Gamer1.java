package Gamers;

public class Gamer1 {

    private int xp;
    private int power;

    public Gamer1(int xp, int power) {
        this.xp = xp;
        this.power = power;
    }

    public int getXp() {
        return xp;
    }

    public int getPower() {
        return power;
    }

    public int attack(Gamer2 gamer2) {
        int o = gamer2.getXp() - this.getPower();
        if (gamer2.getXp() <= 0) {
            System.out.println("Gamer2 Won");
            return 1;
        } else {
            return 0;
        }
    }
}
