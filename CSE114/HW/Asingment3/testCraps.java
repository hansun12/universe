package CSE114.HW.Asingment3;
import java.util.Random;
import java.util.Scanner;

public class testCraps {

    public static char evaluateRoll(int point, int dice1, int dice2){
        if(point == 0){
            if(dice1 + dice2 == 2 || dice1 + dice2 == 3 || dice1 + dice2 == 12) {
                return 'l';
            }
            if(dice1 + dice2 == 7 || dice1 + dice2 == 11) {
                return 'w';
            }
            return 'p';
        }
        return 'c';
    }

    public static int Roll() {
        Random rd = new Random();

        return rd.nextInt(6) + 1;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Play Craps(y/n): ");
        String play = sc.next();
        int point = 0;
        while(play.equals("y")) {
            while(true) {
                int dice1 = Roll();
                int dice2 = Roll();

                System.out.printf("(%d, %d) ",dice1, dice2);
                char res = evaluateRoll(point, dice1, dice2);

                if(res == 'w') {
                    System.out.println("Player Wins!");
                    point = 0;
                    break;
                }
                if(res == 'l') {
                    System.out.println("Player Looses!");
                    point = 0;
                    break;
                }
                if(res == 'c') {
                    dice1 = Roll();
                    dice2 = Roll();
                    System.out.printf("(%d, %d) ", dice1, dice2);
                    evaluateRoll(point, dice1, dice2);
                    if(dice1 + dice2 == 7) {
                        System.out.println("Player Looses!");
                        point = 0;
                        // break;
                    }
                    if(dice1 + dice2 == point) {
                        System.out.println("Player Wins!");
                        point = 0;
                        // break;
                    }
                }
                if(res == 'p') {
                    point = dice1 + dice2;
                    System.out.printf("point: %d ",point);
                }
            }
            System.out.print("Play again?(y/n): ");
            play = sc.next();
        }
    }
}
