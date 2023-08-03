package CSE114.HW.Asignment2;
import java.util.Scanner;

public class Volumes {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Volume 1:");
        System.out.print("Enter gallons: ");
        int gallon1 = sc.nextInt();
        System.out.print("Enter quarts: ");
        int quart1 = sc.nextInt();
        System.out.print("Enter cups: ");
        int cup1 = sc.nextInt();
        
        System.out.println("Volume 2:");
        System.out.print("Enter gallons: ");
        int gallon2 = sc.nextInt();
        System.out.print("Enter quarts: ");
        int quart2 = sc.nextInt();
        System.out.print("Enter cups: ");
        int cup2 = sc.nextInt();
        
        int gallon3 = gallon1 + gallon2;
        int quart3 = quart1 + quart2;
        int cup3 = cup1 + cup2;

        quart3 += cup3 / 4;
        cup3 = cup3 % 4;

        gallon3 += quart3 / 4;
        quart3 = quart3 % 4;

        System.out.println("Totals: Gallons:" + " " + gallon3 + " " + "Quarts:" + " " + quart3 + " " + "Cups:" + " " + cup3);

    }
}
