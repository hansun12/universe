// Run this program as follows:
//
// java ArgsTest
// java ArgsTest 1
// java ArgsTest 3
// java ArgsTest 45 34
// java ArgsTest 45 34 apple         // This one won't work why?

public class ArgsTest {

    public static void needString (String s) {
        System.out.println(s);
    }

    public static void needInteger (int i) {
        System.out.println(i);
    }

    public static void main (String[] args) {
        // Uncomment the next three lines and try the commands above
        //           to see how it behaves...
        // System.out.println(args[0]);  // This one requires at least
                                         // one command line argument.
        // System.out.println(args[1]);  // This one at least 2
        // System.out.println(args[2]);  // This one at least 3

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

/*

 Why is this sort of command-line argument mechanism useful?
 Or, even necessary in some situations?

 Think about the interface between the operating system such as DOS
 or Unix and the programming language system like Java.  How would
 the operating system provide information to the langauge when a
 program written in the language is first invoked to run?  That is,
 when a new process for the program is created and starts to run?
 Also, if a program written in Java wants to return some information
 back to the OS?
 After all, when OS calls the main in a Java program, a function in
 OS is calling the function main in the Java program.
 So, it is after all a function calling another function - the only
 key difference is that a function in language, say C in Unix, is
 calling a function, i.e., main, in Java.  Calling functions across
 the language boundary between C and Java is not any different
 conceptually although it would take a little more work to make it
 work.

 See SimilateOS.java to see how an OS function might call the main
 in a Java program.
 

 If you want to run this program in IntelliJ, it will not work
 without some modifications. This can be complicated to do and we
 will not worry about it for this class, but there is an easier 
 workaround that can simulate the same behavior. 

 See ArgTest2.java to see how I did it.
   
*/
