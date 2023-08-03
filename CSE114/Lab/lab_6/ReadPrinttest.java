package CSE114.Lab.lab_6;
import java.util.Scanner;
public class ReadPrinttest {
    
    public static int generateList(int n){
        if(n > 0){
            for(int i = 0; i < n; ++i);
        }
        else{
            for(int i = n; i = 0; ++i);
        }
        return i;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter num: ");
        int num = sc.nextInt();
        int res = generateList(num);

        System.out.println(res); 
    }
}
