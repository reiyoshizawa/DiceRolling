package DiceRolling;

public class Random {
    private int firstDie;
    private int secondDie;

    public Random(){
        this.firstDie = 0;
        this.secondDie = 0;
    }

    public static int roll() {
        int firstDie = (int) (Math.random() * 7);
        int secondDie = (int) (Math.random() * 7);
        int sum = firstDie + secondDie;
        return sum;
    }

}
