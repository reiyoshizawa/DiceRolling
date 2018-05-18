package DiceRolling;

public class DiceRoll {
    public static void main(String[] args) {
        final int RollingNum = 36000000;
        Random coin = new Random();
        int count_sum_2 = 0;
        int count_sum_3 = 0;
        int count_sum_4 = 0;
        int count_sum_5 = 0;
        int count_sum_6 = 0;
        int count_sum_7 = 0;
        int count_sum_8 = 0;
        int count_sum_9 = 0;
        int count_sum_10 = 0;
        int count_sum_11 = 0;
        int count_sum_12 = 0;

        for (int i = 0; i < RollingNum; i++) {
            coin.roll();
            int sum = coin.roll();
            switch (sum) {
                case 2:
                    count_sum_2++;
                    break;
                case 3:
                    count_sum_3++;
                    break;
                case 4:
                    count_sum_4++;
                    break;
                case 5:
                    count_sum_5++;
                    break;
                case 6:
                    count_sum_6++;
                    break;
                case 7:
                    count_sum_7++;
                    break;
                case 8:
                    count_sum_8++;
                    break;
                case 9:
                    count_sum_9++;
                    break;
                case 10:
                    count_sum_10++;
                    break;
                case 11:
                    count_sum_11++;
                    break;
                case 12:
                    count_sum_12++;
                    break;
            }
        }
        System.out.println("2: " + count_sum_2);
        System.out.println("3: " + count_sum_3);
        System.out.println("4: " + count_sum_4);
        System.out.println("5: " + count_sum_5);
        System.out.println("6: " + count_sum_6);
        System.out.println("7: " + count_sum_7);
        System.out.println("8: " + count_sum_8);
        System.out.println("9: " + count_sum_9);
        System.out.println("10: " + count_sum_10);
        System.out.println("11: " + count_sum_11);
        System.out.println("12: " + count_sum_12);
    }
}
