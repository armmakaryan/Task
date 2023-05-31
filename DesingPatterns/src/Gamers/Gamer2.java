package Gamers;

public class Gamer2 {

    private int xp;
    private int power;

    public Gamer2(int xp, int power) {
        this.xp = xp;
        this.power = power;
    }

    public int getXp() {
        return xp;
    }

    public int getPower() {
        return power;
    }

    public int attack(Gamer1 gamer1) {
        int o = gamer1.getXp() - this.getPower();
        if (gamer1.getXp() <= 0) {
            System.out.println("Gamer2 Won");
            return 1;
        } else {
            return 0;
        }
    }
}
