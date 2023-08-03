/*
 * Simulating an operating system and programming language interface.
 */
public class SimulateOS {

    public static void main (String[] args) {

        // The next two lines are simulating what an operating system
        // (Unix or DOS) does when it starts up a Java program, e.g.,
        // ArgTest in this example.
        //
        String[] numbers = {"123", "43"};
        ArgsTest.main(numbers);

        // a call to another method in ArgsTest just to show you
        // that calling main in ArgTest is not any different than
        // calling any other static methods there.
        //
        ArgsTest.needInteger(56);
    }
    
}
