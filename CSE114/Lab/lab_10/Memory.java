
public class Memory {

    public static void swap (int x, int y) {
        int temp = x;
        x = y;
        y = temp;
    }

    public static void swap2 (int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void print (int[] aa) {
        for (int i = 0; i < aa.length; i++) {
            System.out.print(aa[i] + " ");
        }
        System.out.println();
    }

    public static void main (String[] args) {
        int i = 2;
        int j = 3;
        int[] aa = {10, 20, 30, 40};

        System.out.println("i = " + i + " j = " + j);
        swap(i, j);
        System.out.println("i = " + i + " j = " + j);
        
        print(aa);
        swap(aa[2], aa[3]);
        print(aa);

        swap2(aa, 2, 3);
        print(aa);
    }
    
}
