package CSE114.Lab.lab_5;

public class add4 {
    public static int add2(int num1, int num2){
        return num1 + num2;
    }
    
    public static int add4Method(int a, int b, int c, int d){
        return add2(add2(a, b), add2(c, d)); 
    }

    public static void main(String[] args){
        int sum = add4Method(1, 2, 3, 4);
        System.out.println(sum);
    }

}
