package CSE114.HW.Asingment3;

import java.lang.Math;

public class Series {

    public static double series(double x, int n) {
        if(x <= -1 || x >= 1.0) {
            return -1.0;
        }
        if(n <= 0) {
            return -1.0;
        }
        
        double ans = 1.0;
        int num = 2;
        
        while(num <= n) {
            double temp = (1.0 / num) * Math.pow(x, num - 1);
            if(num % 2 == 0) {
                temp *= -1;
            }
            ans += temp;
            num++;
        }

        return ans;
    }

    public static void main(String[] args){
        System.out.print("series(0.6, 3) should be 0.82");
        System.out.println(" : " + series(0.6, 3));

        System.out.print("series(0.6, 4) should be 0.766");
        System.out.println(" : " + series(0.6, 4));

        System.out.print("series(0.6, 5) should be 0.79192");
        System.out.println(" : " + series(0.6, 5));

        System.out.print("series(-1.5, 3) should be -1.0");
        System.out.println(" : " + series(-1.5, 3));

        System.out.print("series(1.5, 3) should be -1.0");
        System.out.println(" : " + series(1.5, 3));

        System.out.print("series(0.5, 0) should be -1.0");
        System.out.println(" : " + series(0.5, 0));

        System.out.print("series(0.8, 1) should be 1.0");
        System.out.println(" : " + series(0.8, 1));

        System.out.print("series(0.8, 2) should be 0.6");
        System.out.println(" : " + series(0.8, 2));

        System.out.print("series(0.8, 3) should be 0.8133333333333334");
        System.out.println(" : " + series(0.8, 3));
    }

}
