// Exception handling (a brief encounter)
// using a simple try-catch block

import java.io.*;

class Numbers {

    /*
     *  Prints one half of the value of the int in a specified String object.
     *
     *  @param s - the String object that consists of an int.
     */
    public static void printHalf(String s) {
        try {
            System.out.println("Half of " + s + " is " +
                               (Integer.parseInt(s) / 2));
        }
        catch (NumberFormatException e)        {
            System.out.println(e.getMessage());
            System.out.println("You are here");
            System.out.println(e);
        }

        System.out.println("\n...continuing with the rest of the program");
    }


    public static void main(String[] args) {

        System.out.println("\nCalling printHalf with 50");
        printHalf("50");

        System.out.println("\n\nCalling printHalf with 5.0 this time");
        Numbers.printHalf("5.0");

        System.out.println("\n\nCalling printHalf with 5 45 this time");
        Numbers.printHalf("5 45");  // Try this line also to see what happens

    }

}
