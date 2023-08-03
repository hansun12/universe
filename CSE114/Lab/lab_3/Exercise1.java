public class Exercise1 {

    public static void main (String[] args) {

        double width;   // Declare a variable
        width = 10;     // and initialize it with 10 as its value,
                        // done in two lines

        double height = 20; // Alternatively, do both in one line

        double area;
        area = width * height;

        System.out.println();
        System.out.println("Width is " + 10.0);     // Role of " and "
        System.out.println("Height is " + height);  // Role of +

        System.out.println("Area of a rectangle with two sides 10.0" +
                           " and " + height + " is " + area);

        // Now, let's scale (enlarge) the rectangle:
        int xScaleFactor = 2;
        int yScaleFactor = 3;
        width = width * xScaleFactor;
        height = height * yScaleFactor;
        area = width * height;
        System.out.println("\t Area of a rectangle with two sides " +
                           width + " and " + height + " is " + area);

        System.out.println(20 + 30 + "Width is " + 10 + 20 + " end.");
    }

}

/*  Answer the following questions regarding the program given above:

 1. First, run this program and understand what the program does.
 
 2. What is the type of the variable area?
 
 3. How many variables are declared in the program?

 4. What are their names?

 5. How many bits in total are used by all the variables used in the
    body of the main method in this program?

 6. Some variables with an integer or real number as their value are
    automatically converted, e.g., from an int to double, by Java.
    Identify all of those cases and explain them to your classmate
    or to yourself.
    
 7. In the middle of a string in a System.out.println statement, add an
    instance of \t much like I added \n and see what it does.  \n gives
    you a blank line in the output.  \t does something different.  Google
    to find out what it does if you can't figure it out by running the
    program.

 8. What is the output generated by the last line in main? Explain to
    youself why it prints what it prints.

 When you study an example program that we study in class, try to ask
 questions as I did here and answer them.  Also poke around, i.e., change
 things and see what they do.
 
*/
