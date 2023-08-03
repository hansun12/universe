public class greatestNumber {
    public static double greatestnum(double num1, double num2){
        double greatnum;
        if (num1 > num2){
            greatnum = num1;
        }
        else {
            greatnum = num2;
        }
        return greatnum;
    }
    public static void main(String[] args){
        System.out.println(greatestnum(54.6,106.4));
    }
}
