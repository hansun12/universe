public class Parameter {

    public static void swap (int x, int y) {
        int temp = x;
        x = y;
        y = temp;
    }

    public static void main (String[] args) {
        int x = 2;
        int y = 4;
        
        swap(x, y);
        System.out.println(x + ", " +  y);
    }
    
}
