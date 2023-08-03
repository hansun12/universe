package CSE114.HW.Asignment2;

import java.util.Scanner;

public class VolumesTC {
    public static void main (String[] args) {
        int gallon1, gallon2, gallon3;
        int quarts1, quarts2, quarts3;
        int cup1, cup2, cup3;

        Scanner sc = new Scanner(System.in);
        System.out.println("Volume 1:");
        System.out.print("Enter gallons (int): ");
        gallon1 = sc.nextInt();
        System.out.print("Enter quarts (int): ");
        quarts1 = sc.nextInt();
        System.out.print("Enter cups (int): ");
        cup1 = sc.nextInt();

        System.out.println("Volume 2:");
        System.out.print("Enter gallons (int): ");
        gallon2 = sc.nextInt();
        System.out.print("Enter quarts (int): ");
        quarts2 = sc.nextInt();
        System.out.print("Enter cups (int): ");
        cup2 = sc.nextInt();

        gallon3 = gallon1 + gallon2;
        quarts3 = quarts1 + quarts2;
        cup3 = cup1 + cup2;

        // quarts3 += cup3 / 10;
        // cup3 = cup3 % 10;

        gallon3 += quarts3 / 4;
        quarts3 = quarts3 % 4;

        System.out.println("Totals: Gallons: " + gallon3 + " Quarts: " + quarts3 + " Cups: " + cup3);
        sc.close();
    }
}
