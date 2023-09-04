package CSE214;

public class test {
    public static void main(String[] args) {
        
        int a[] = {0, 1, 2, 3, 4, 5};

        try{
            for(int i = 0; i <= a.length; i++) {
                System.out.println(a[i]);
            }
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }

        // public toString(){
        //     return String.vulueof(x);
        // }
    }
}
