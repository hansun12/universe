package CSE114.HW.Asignment2;

public class RollingAvgTC {
    public static void main (String[] args) {
        int n1 = 5;
        int n2 = 10;
        int n3 = 7;
        int n4 = 50;
        int n5 = 33;
        int n6 = 21;
        int n7 = 2;

        double average = (double)(n1 + n2 + n3 + n4 + n5 + n6 + n7) / 7;

        System.out.println("java RollingAvg");
        System.out.printf("The values are: %d %d %d %d %d %d %d\n", n1, n2, n3, n4, n5, n6, n7);
        System.out.printf("The sum is: %d\n", n1 + n2 + n3 + n4 + n5 + n6 + n7);
        System.out.printf("Average of n1 through n7 is %.4f\n", average);

        double ravg = (double)(n1 + n2) / 2;
        System.out.printf("Average of n1 through n2 is %7.4f\n", ravg);

        ravg = ((2 * ravg) + n3) / 3.0;
        System.out.printf("Average of n1 through n3 is %7.4f\n", ravg);

        int previousvaluecount = 3;
        int newvaluecount = 4;
        ravg = ((previousvaluecount * ravg) + n4) / (double) newvaluecount;
        previousvaluecount++;
        newvaluecount++;
        System.out.printf("Average of n1 through n4 is %7.4f\n", ravg);

        ravg = ((previousvaluecount * ravg) + n5) / (double) newvaluecount;
        previousvaluecount++;
        newvaluecount++;
        System.out.printf("Average of n1 through n5 is %7.4f\n", ravg);

        ravg = ((previousvaluecount * ravg) + n6) / (double) newvaluecount;
        previousvaluecount++;
        newvaluecount++;
        System.out.printf("Average of n1 through n6 is %7.4f\n", ravg);

        ravg = ((previousvaluecount * ravg) + n7) / (double) newvaluecount;
        previousvaluecount++;
        newvaluecount++;
        System.out.printf("Average of n1 through n7 is %7.4f\n", ravg);
        
    }
}
