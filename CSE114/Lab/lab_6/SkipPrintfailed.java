package CSE114.Lab.lab_6;
import java.util.Scanner;
public class SkipPrintfailed {

    public static int skipPrint(int num){
        String res = "";
        for(int i = 0; i >= num; ++i){
            if(i != (3*i)){
                if(i != 5*i){
                    res += i + " ";
                }
            }
        }
        return res;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        
        if(num > 0){
            skipPrint(num);
        }

        else{
            System.out.print("The number is not positive");
        }


    }
}
