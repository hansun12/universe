package CSE114.HW.Asingment3;

import java.util.Scanner;
import java.util.Random;

public class Ticket {
    static double price = 21.0;

    static double calculatePriceByAge(int age) {
        double rate = 0.0;

        if(age >= 65) {
            rate = 25.0;
        }
        else if(age >= 22) {
            rate = 0.0;
        }
        else if(age >= 19) {
            rate = 15.0;
        }
        else if(age >= 7) {
            rate = 20.0;
        }
        else {
            rate = 100.0;
        }
        if(rate != 100.0) {
            System.out.printf("Age Discount is: %.2f %%\n", rate);
        }
    
        return rate;
    }

    static double calculatePriceByLuck() {
        Random random = new Random();
        int r = random.nextInt(10) + 1;

        double rate = 0.0;

        if(r >= 8) {
            rate = 25.0;
        }
        else if(r >= 5) {
            rate = 10.0;
        }
        
        return rate;
    }

    public static void main(String[] args){
        System.out.print("Please enter your age: ");
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();
        double dcage = calculatePriceByAge(age);
        double dcluck = calculatePriceByLuck();
        
        if((int)dcage == 100){
            System.out.printf("\nYou're ticket price is 0.00\n");

            return;
        }
        if((int)dcluck != 0){
            System.out.printf("Lucky discount is %.1f%% [You're a winner!]\n", dcluck);
        }
        else {
            System.out.printf("\n");
        }
        
        price = price * (100.0 - dcage) / 100.0;
        price = price * (100.0 - dcluck) / 100.0;
        System.out.printf("You're ticket price is %.2f\n", price);
        
        sc.close();
    }

}