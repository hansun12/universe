import java.util.Scanner;

public class Person {

    static int age;
    static String name;
    static Double height;
    static String course;
    public static void main(String[] args) {
        // open stdin stream 
        Scanner sc = new Scanner(System.in);

        System.out.print("name: ");
        name = sc.next();

        System.out.print("age: ");
        age = sc.nextInt();

        System.out.print("height: ");
        height = sc.nextDouble();

        System.out.print("course: ");
        course = sc.nextLine(); // buffer
        course = sc.nextLine();
        System.out.println();

        System.out.format( "%s is %d years old and ", name, age);
        System.out.println(height + "f feet tall.");
        System.out.format("S/He says: I am enrolled in %s.\n", course);

        // close stream
        sc.close();
    }
}

