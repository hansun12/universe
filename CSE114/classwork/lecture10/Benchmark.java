/* Run it like this:
 * Prompt> java Benchmark 10 Extra Stuff
 */

public class Benchmark {

    // Do nothing, just return
    public static void benchmark () {
        ;
    }

    /* Check Java documentation on System.currentTimeMillis() if you
     * are not sure of what this method does.  Go ahead and take a 
     * look.
     *
     * We will be using System.currentTimeMillis() to mesure execution
     * time whenever we need to measure the performance of any Java
     * program that we write.  See how we wrap around a piece of code
     * with two separate calls to this function.
     */
    public static long repeat (int count) {
        long start = System.currentTimeMillis();

        for (int i = 0; i < count; i++) {
            benchmark();
        }
        return (System.currentTimeMillis() - start);
    }

    public static void main (String[] args) {

        if (args.length < 1) {
            return;
        }

        int count = Integer.parseInt(args[0]);
        long time = repeat(count);

        System.out.println(count + 
                           " methods in " + 
                           time +
                           " milliseconds");

        System.out.println(args[1]);

        System.out.println(args[2]);
    }

}
