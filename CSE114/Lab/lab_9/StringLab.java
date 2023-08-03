package CSE114.Lab.lab_9;

import java.lang.String;
import java.util.Arrays;

public class StringLab {

    public static void wordCount(String word) {
        String[] wordArray = word.split(" "); // [""]
        // System.out.println(Arrays.toString(wordArray));
        String[][] letter = new String[wordArray.length][];
        for(int i = 0; i<wordArray.length; i++) {
            letter[i] =new String[] {wordArray[i]}; // 레터[] , 워드어레
        }
        System.out.println(Arrays.deepToString(letter));
        System.out.println(letter.length);

    }

    public static void main(String[] args) {
        String word = ("It is raining outside, and it looks like it will continue for a WHILE!");
        wordCount(word);
        
    }
}