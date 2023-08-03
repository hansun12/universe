package CSE114.HW.Asignment2;

import java.util.Scanner;

public class Change {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter money: ");
        double money = sc.nextDouble();
        money *= 100;

        int dollar = (int)money / 5000;
        money -= (double)dollar * 5000.0;
        System.out.printf("%d $50 bills\n", dollar);

        dollar = (int)money / 2000;
        money -= (double)dollar * 2000.0;
        System.out.printf("%d $20 bills\n", dollar);

        dollar = (int)money / 1000;
        money -= (double)dollar * 1000.0;
        System.out.printf("%d $10 bills\n", dollar);

        dollar = (int)money / 500;
        money -= (double)dollar * 500.000;
        System.out.printf("%d $5 bills\n", dollar);

        dollar = (int)money / 100;
        money -= (double)dollar * 100.0;
        System.out.printf("%d $1 bills\n", dollar);

        dollar = (int)money / 50;
        money -= (double)dollar * 50.0;
        System.out.printf("%d Half dollar coin\n", dollar);

        dollar = (int)money / 25;
        money -= (double)dollar * 25.0;
        System.out.printf("%d quarters\n", dollar);

        dollar = (int)money / 10;
        money -= (double)dollar * 10.0;
        System.out.printf("%d dimes\n", dollar);

        dollar = (int)money / 5;
        money -= (double)dollar * 5.0;
        System.out.printf("%d nickels\n", dollar);

        dollar = (int)money / 1;
        money -= (double)dollar * 1.0;
        System.out.printf("%d pennies\n", dollar);

    }
}
