package CSE114.HW.Asignment2;
import java.util.Scanner;
public class test {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter dollar: ");
        double dollar = sc.nextDouble();
        
        System.out.printf("%.1f", dollar / 50);
        System.out.println(dollar%50);

        System.out.println(dollar/20);

        

       

    }

}

