package CSE114.HW.Asingment3;
import java.util.Random;
import java.util.Scanner;

public class Craps {

    public static char evaluateRoll(int point, int dice1, int dice2) {
        if(point == 0) {
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

    public static int roll() {
        Random random = new Random();

        return random.nextInt(6) + 1;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Play Craps? (y/n): ");
        String play = sc.next();
        int point = 0;

        while(play.equals("y")) {
            while(true) {
                int dice1 = roll();
                int dice2 = roll();
                System.out.printf("(%d, %d) ", dice1, dice2);
                
                char result = evaluateRoll(point, dice1, dice2);
                if(result == 'w') {
                    point = 0;
                    System.out.println("Player wins!");
                    break;
                }

                if(result == 'l') {
                    point = 0;
                    System.out.println("player looses!");
                    break;
                }

                if(result == 'c') {
                    if(dice1 + dice2 == 7) {
                        point = 0;
                        System.out.println("player looses!");
                        break;
                    }
                    if(dice1 + dice2 == point) {
                        point = 0;
                        System.out.println("Player wins!");
                        break;
                    }
                }

                if(result == 'p') {
                    point = dice1 + dice2;
                    System.out.printf("Point: %d ", point);
                }
            }

            System.out.print("Play again? (y/n): ");
            play = sc.next();
        }

        System.out.println("Thanks for playing!");
        sc.close();
    }
}