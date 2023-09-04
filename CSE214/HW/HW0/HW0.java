package CSE214.HW.HW0;

import java.util.Arrays;
import java.util.Scanner;
public class HW0 {

    public static int[] array(int arr[]) {
        int ans[] = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            ans[i] = arr[i] + 1;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str[] = new String[4];
        int ans[] = new int[4];
        int size = ans.length;

        for(int i = 0; i < size; i++) {
            str[i] = sc.nextLine();
        }
        for(int i = 0; i < size; i++) {
            ans[i] = Integer.parseInt(str[i]);
        }
        int res[] = array(ans);
        System.out.println(Arrays.toString(res));
        sc.close();
    }
}

    

