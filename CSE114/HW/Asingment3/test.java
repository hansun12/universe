package CSE114.HW.Asingment3;
import java.util.Random;
import java.util.Scanner;

public class test {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Play Craps(y/n): ");
        String play = sc.next();

        while(play.equals("y")) {
            while(true) {
                System.out.print("Enter name: ");
                String test = sc.next();
                if(test.equals("hansun")) {
                    System.out.println("Correct name!");
                }
                }
            }
            System.out.print("Play again?(y/n): ");
            play = sc.next();
        }
    }

