package CSE114.classwork.lecture21;

//
// Antonino N. Mione
// 1-Jun-2020

/* To see what operations are available on an ArrayList,
 * see java.util.ArrayList on Java Documents website.
 */

import java.util.*;
import java.io.*;

public class SpellCheck {

    private ArrayList<String> theDict = new ArrayList<String>();

    public SpellCheck() {
        // Constructor
        // load the dictionary from dict.txt
        loadDict();
    }

    public void loadDict() {
        // Create a Buffered Reader and then use that in a console
        // to read words from dict.txt
        try {
            BufferedReader dictReader = new BufferedReader(new FileReader("dict.txt"));
            Scanner dScan = new Scanner(dictReader);

            while (dScan.hasNext()) {
                String word = dScan.next();
                theDict.add(word);
            }
            dScan.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        SpellCheck sc = new SpellCheck();

        // Need a scanner for user input
        Scanner console = new Scanner(System.in);
        String word = "";

        System.out.print("Enter a word: ");
        word = console.next();
        // Read words from user and loop until the word is 'quit'
        while (!word.equalsIgnoreCase("quit")) {
            // Check the word
            if (!sc.theDict.contains(word)) {
                System.out.println(word + " is not in the dictionary!");
            }
            // Read next word
            if (!console.hasNext()) {
                break;
            } else {
                word = console.next();
            }
        }

        // Close the scanner
        console.close();
    }

}
