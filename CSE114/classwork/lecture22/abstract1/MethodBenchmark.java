/* To run try the following:
 *
 *     java MethodBenchmark n
 *
 * where n is an integer number of calls that you want to make
 * in measuring the time.
 */
public class MethodBenchmark extends Benchmark {

    public void benchmark () {
        ;     // This is an empty method
    }
    // Compare it with
    //     public void benchmark ();
    // This is different from a method with an empty body
 

    public static void main (String[] args) {

	int count = Integer.parseInt(args[0]);

	long time = new MethodBenchmark().repeat(count);

	System.out.println(count + 
			   " methods in " + 
			   time +
			   " nanoseconds");
    }

}
