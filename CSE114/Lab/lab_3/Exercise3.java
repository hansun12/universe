import java.util.Scanner;


public class Exercise3 {
    public static void main(String[] args) {
        int age;
        String name;
        Double height;
        String sentence;

        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.println("name:");
        name = sc1.next();

        System.out.println();
        System.out.println("age:");
        age = sc1.nextInt();
        System.out.println();

        System.out.println("height:");
        height = sc1.nextDouble();
        System.out.println();

        System.out.println("course:");
        sentence = sc2.nextLine();
        System.out.println();

        System.out.println(name + " " + "is" + " " + age + " " + "years old and" + " " + height + " " + "tall.");
        System.out.println(sentence);
        System.out.println();

        sc1.close();
        sc2.close();
    }
}
