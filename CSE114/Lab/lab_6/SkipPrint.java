package CSE114.Lab.lab_6;
import java.util.Scanner;

public class SkipPrint {
    public static String skipPrint(int num){
        String res = "";
        for(int i = 0; i <= num; ++i){
            if(i == 0 || i % 3 != 0 && i % 5 != 0){
                res += i + " ";
            }
        }
        return res;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        
        if(num > 0){
            String res = skipPrint(num);
            System.out.println(res);
        }

        else{
            System.out.print("The number is not positive");
        }

    }
        
    
}