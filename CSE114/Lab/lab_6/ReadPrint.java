package CSE114.Lab.lab_6;
import java.util.Scanner;

public class ReadPrint {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numer: ");
        int n = sc.nextInt();

        if(n > 0){
            for(int i = 1; i < n + 1; ++i){
                System.out.print(i + " ");
            }
            System.out.print("\n");
        }
        else{
            for(int i = n; i < 1; ++i){
                System.out.print(i + " ");
            
            }
        }
        System.out.print("\n");
    }
}