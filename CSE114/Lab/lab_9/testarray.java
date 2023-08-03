package CSE114.Lab.lab_9;

public class testarray {
    public static void main(String[] args) {
        String sentence = "This is a sample sentence";
        String[] words = sentence.split(" ");
        String[][] letters = new String[words.length][];
        
        for (int i = 0; i < words.length; i++) {
            String[] chars = words[i].split("");
            letters[i] = new String[chars.length + 2]; // 문자열 길이 + 2
            letters[i][0] = "[";
            for (int j = 0; j < chars.length; j++) {
                letters[i][j+1] = chars[j];
            }
            letters[i][chars.length+1] = "]";
        }
        
        // letters 배열 출력
        for (int i = 0; i < letters.length; i++) {
            for (int j = 0; j < letters[i].length; j++) {
                System.out.print(letters[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}
