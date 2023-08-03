import java.util.Scanner;
public class checkName {
    // public static String Name(String save, String name) {
    //     if (save.equals(name)) {
    //         System.out.println("it matches");
    //     }
    //     else {
    //         System.out.println("Does not match");
    //     }
            
    // }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        String name1 = sc.next();
        System.out.println(name1);
        // System.out.println(Name("hansun", name1));
        sc.close();
    }
}
