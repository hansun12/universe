package CSE114.Lab.lab_6;
import java.util.Scanner;
public class Collatz {

    public static int isEven(int n){
        if(n % 2 == 0){
            n = n / 2;
        }
        else{
            n = 3 * n + 1;
        }
        return n;
    }

    public static int nextCollatz(int num1){
        return isEven(num1);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num: ");
        int num = sc.nextInt();
        int ans = nextCollatz(num);

        System.out.println(ans);
    }
}
