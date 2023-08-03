// Read this after you read ArgsTest.java
// And only if you want to run it in IntelliJ rather than on a command line.

public class ArgsTest2 {

    public static void needString (String s) {
        System.out.println(s);
    }

    public static void needInteger (int i) {
        System.out.println(i);
    }

    public static void main (String[] args) {

        //        String[] sa = {"!"};
        String[] sa = {"45", "34"};
        //        String[] sa = {"45", "34", "apple"}; // this would not work

        args = sa;

        //        System.out.println(args[0]);
        //        System.out.println(args[1]);
        //        System.out.println(args[2]);
        
        System.out.println("Output them as strings: ");
        for (int i = 0; i < args.length; i++) {
            needString(args[i]);
        }

        System.out.println("\nOutput them as integers: ");
        for (int i = 0; i < args.length; i++) {
            int num = Integer.parseInt(args[i]);
            needInteger(num);
        }

    }
}

