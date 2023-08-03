package CSE114.Lab.lab_5;

public class add4addStrings {
    public static int add4(int num1, int num2, int num3, int num4){
        return num1 + num2 + num3 + num4;
    }
    public static String addstring(String a, String b, String c){
        return a + b + c;
    }
    public static String add4addstrings(int a, int b, int c, int d, String ch1, String ch2, String ch3){
        return add4(a, b, c, d) + addstring(ch1, ch2, ch3);
    }

    public static void main(String[] args){
        String sum7 = add4addstrings(1, 2, 3, 4, "apple", "orange", "kiwi");
        System.out.println(sum7);
    }
}
