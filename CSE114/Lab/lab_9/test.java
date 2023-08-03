package CSE114.Lab.lab_9;

import java.lang.String;
import java.util.Arrays;

public class test {
    public static void wordCount(String word) {
        String[] wordArray = word.split(" ");
        String[][] letter = new String[wordArray.length][];
        for(int i = 0; i<wordArray.length; i++) {
            letter[i] = new String[]{wordArray[i]};
        }
        System.out.println(Arrays.deepToString(letter));
        System.out.println(letter.length);
    }
    
    {1,1,2,2,3,3}
        
}

