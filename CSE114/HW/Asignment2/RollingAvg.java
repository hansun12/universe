package CSE114.HW.Asignment2;

public class RollingAvg {
    public static void main(String[] args){
        int n1 = 5;
        int n2 = 10;
        int n3 = 7;
        int n4 = 50;
        int n5 = 33;
        int n6 = 21;
        int n7 = 2;
        int sum = n1 + n2 + n3 + n4 + n5 + n6 + n7;

        double average = (n1 + n2 + n3 + n4 + n5 + n6 + n7) / 7.0;

        System.out.println("java RollingAvg");
        System.out.printf("The values are: %d %d %d %d %d %d %d\n", n1, n2, n3, n4, n5, n6, n7);
        System.out.println("The sum is: " + sum);
        System.out.printf("Average of n1 through n7 is: %.4f\n" ,average);
        double ravg = (n1 + n2) / 2.0;
        System.out.printf("Average of n1 through n2 is: %.4f\n" ,ravg);
        ravg = ((2 * ravg) + n3) / 3.0;
        System.out.printf("Average of n1 through n3 is: %.4f\n" ,ravg);
        ravg = ((3 * ravg) + n4) / 4.0;
        System.out.printf("Average of n1 through n4 is: %.4f\n" ,ravg);
        ravg = ((4 * ravg) + n5) / 5.0;
        System.out.printf("Average of n1 through n5 is: %.4f\n" ,ravg);
        ravg = ((5 * ravg) + n6) / 6.0;
        System.out.printf("Average of n1 through n6 is: %.4f\n" ,ravg);
        ravg = ((6 * ravg) + n7) / 7.0;
        System.out.printf("Average of n1 through n7 is: %.4f\n" ,ravg);
    }
}
