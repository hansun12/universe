/* In program_structure_5.txt I talked about class X and class UseX.
 * Using Random, I created UseRandom here.  In this example, Random was
 * already created by the Java people.  So, we will only create UseRandom.
 *
 * In our case from now on, we will be creating both X and UseX ourselves.
 * For example, Account and UseAccount, which we will see next.
 */

import java.util.Random;

public class UseRandom {

    public static void main(String[] args) {

        Random randgen = new Random();  // create an object

        int n = randgen.nextInt();      // use it by calling a method with it

        System.out.println("A random integer: " + n);
    }

}
