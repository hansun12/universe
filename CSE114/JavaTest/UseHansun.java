package CSE114.JavaTest;

import java.util.ArrayList;

public class UseHansun {
    public static void main(String[] args) {
        ArrayList<Hansun> hansun = new ArrayList<Hansun>();

        Hansun tempHansun = new Hansun(0, 0); 
        hansun.add(tempHansun);
        hansun.add(new Hansun(1, 1));
        
        for(int i = 0; i < hansun.size(); i++) {
            hansun.get(i).print();
        }

        hansun.remove(hansun.size() - 1);

        for(int i = 0; i < hansun.size(); i++) {
            hansun.get(i).print();
        }
    }
}