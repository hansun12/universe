import java.io.*;

public class Fio2 {

    /* Read a line at a time
     * Use the try...catch form as a pattern.
     * Returns null if it reached the end of the file.
     */
    public static String readALine (BufferedReader input) {
        String line = "";
        try {
            line = input.readLine();
        }
        catch (IOException e) {
            System.out.println("Oops");
        }
        return line;
    }

    // Rather than catching IOException's in main, main can pass it on
    // by 'throw'ing it, which is what I chose to do here.
    //
    public static void main (String[] args) throws IOException {

        /* ===========================================================
         * Let's see how to read from a file.
         */
        String inputFile = "./people.in2";
	BufferedReader input = null;
        
	try {
	    // Pattern to be used to "open an input file"
	    input = new BufferedReader(new FileReader(inputFile));
	}
	catch (FileNotFoundException e) {
	    System.out.println("Sorry, the file was not found!");
	    System.exit(1);
	}

        // I am assuming that there is at least one line in the input file
        // and not checking if line is null.
        String line = readALine(input);           // Number of entries
        int numStudents = Integer.parseInt(line); //        in the file.
        Student[] students = new Student[numStudents];

        int i = 0;
        line = readALine(input); // Read the first entry
        while (line != null) {   // Reached the end of the input file?
            int id = Integer.parseInt(line.substring(0,4)); // Extract id
            String name = line.substring(5);  // Extract name
            students[i] = new Student(id, name);  // Create an object
            i = i + 1;
            line = readALine(input);  // Read the next entry if exists
        }

        input.close();  // Close it when done reading from it.
        
        // Now that we have read the file into an array (in memory),
        // let's use that information to do whatever we want to do,
        // hopefully something interesting.  You will do some of them
        // in our next problem set.  Here we will do some simple things,
        // e.g., modify each object and print them.  The modification I chose
        // to do is simply add one to id just to show you that you can
        // choose to change whatever you want to change.
        ArrayTools.printStudentArray(students, "\n ID,  Name pairs:");
        for (i = 0; i < students.length; i++) {
            students[i].setId(students[i].getId() + 1);
        }
        ArrayTools.printStudentArray(students, "\n ID,  Name pairs:");


        /* ===========================================================
         * Let's see how to write to a file this time.
         */
        PrintWriter fileWriter = null;
        String outFName = "./people.out";
        // String outFName = ".\people.out";  // if the other did not work

        // Pattern to be used to "open an output file"
        fileWriter = new PrintWriter(new 
                                     BufferedWriter(new
                                                    FileWriter(outFName)));
        fileWriter.print(numStudents + "\n");
        for (i = 0; i < numStudents; i++) {
            fileWriter.println(students[i]);
            // fileWriter.print(students[i].toString() + "\n"); same
        }
        
        fileWriter.close(); // When done with an output file, "close" it.
    }

}
