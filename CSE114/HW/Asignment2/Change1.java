package CSE114.HW.Asignment2;
import java.util.Scanner;

public class Change1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter money: ");
        double money = sc.nextDouble();
        int dollar = (int)money;

        int fiftyDollar = dollar / 50;
        dollar = dollar % 50;

        System.out.println(fiftyDollar);
        System.out.println(dollar); 
        
        // System.out.println("$50 bills");
        // System.out.println("$20 bills");
        // System.out.println("$10 bills");
        // System.out.println("$5 bills");
        // System.out.println("$1 bills");
        // System.out.println("Half dollar coin");
        // System.out.println("quarters");
        // System.out.println("dimes");
        // System.out.println("nickels");
        // System.out.println("pennies");

    }
}
