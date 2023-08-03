package CSE114.classwork.lecture21;

/* To see what operations are available on an ArrayList,
 * see java.util.ArrayList on Java Documents website.
 */

import java.util.*;

public class UseArrayList2 {

    public static void main(String[] args) {
        // Let's build an ArrayList for Integer's.
        ArrayList<Integer> integerList = makeRandomIntegerList(10, 100, 50);
        System.out.println("integerList contains: " + integerList);
        System.out.println("");

        // Let's see an ArrayList for String's this time.
        stringExample();

        anotherStringExample();
    }

    public static ArrayList<Integer> makeRandomIntegerList(int count, int seed, int limit) {

        Random rand = new Random(seed);

        // Could have used this one:
        // ArrayList<Integer> a = new ArrayList<Integer>(n);
        // but used the one below instead to show that it starts
        // with a default size and resizes it later.
        //
        ArrayList<Integer> integerList = new ArrayList<Integer>();
        for (int i = 0; i < count; i++) {
            integerList.add(rand.nextInt(limit));
        }
        return integerList;
    }

    public static void stringExample() {
        ArrayList<String> sa = new ArrayList<String>(2); // ArrayList of capacity of 2
        System.out.println("Size after creation with capacity 2: " + sa.size());
        sa.add("Apple");
        sa.add("Orange");
        sa.add("Pear");   // When you add the 3rd element, the internal
        sa.add("Kiwi");   // array that the arraylist maintains must be expanded. By how much? Usually 50%
        System.out.println("sa contains: " + sa);
        System.out.println("");

        System.out.println("Size after adding 4 elements: " + sa.size()); // new

        System.out.println("Contains Orange (T/F): " + sa.contains("Orange"));
        sa.remove("Orange");
        System.out.println("Contains Orange (T/F): " + sa.contains("Orange"));

        System.out.println("sa now contains: " + sa);
        System.out.println("");

        // Using for-each to loop through
        System.out.println("for each. . .");
        for (String s : sa) {
            System.out.println(s);
        }
        System.out.println("");

        // Using an iterator (we have not talked about iterators, so
        // don't worry about this one unless you want to)
        System.out.println("using an iterator. . .");
        Iterator<String> itr = sa.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println("");

        System.out.println("empty? (T/F): " + sa.isEmpty());
        System.out.println("Size: " + sa.size());
        System.out.println("");

        sa.clear();
        System.out.println("Size after clear: " + sa.size());
        System.out.println("empty? (T/F): " + sa.isEmpty());
    }

    public static void anotherStringExample() {
        // new list of strings
        ArrayList<String> ls = new ArrayList<String>(5);
        ls.add("Apple");
        ls.add("Orange");
        ls.add("Kiwi");
        ls.add("Banana");
        ls.add("Grapefruit");

        ArrayList<String> ls2 = new ArrayList<String>(5);
        ls2.add("Apple");
        ls2.add("Kiwi");
        ls2.add("Orange");
        ls2.add("Banana");
        ls2.add("Grapefruit");

        // Try changing the order of the lists and see if they are still equal
        System.out.println("The lists ls and ls2 are equal? " + ls.equals(ls2));
        System.out.println("");
	if (ls.containsAll(ls2) && ls2.containsAll(ls)) {
	    System.out.println("Excluding order, ls and ls2 are equal!");
	}

        ls2.add("Banana");
        ls2.add("Grape");
        ls2.add("Banana");
        ls2.add("Cherry");

        for (int i = 0; i < ls2.size(); i++) {
            System.out.println("List2, Index: " + i + " is " + ls2.get(i));
        }

        ls2.remove("Banana");

        System.out.println("");
        System.out.println("After removing Banana");

        for (int i = 0; i < ls2.size(); i++) {
            System.out.println("List2, Index: " + i + " is " + ls2.get(i));
        }

        System.out.println("");

        for (int i = 0; i < ls.size(); i++) {
            System.out.println("List1, Index: " + i + " is " + ls.get(i));
        }
        System.out.println("");

        ls.remove("Orange");

        System.out.println("After removing orange:");

        for (int i = 0; i < ls.size(); i++) {
            System.out.println("List1, Index: " + i + " is " + ls.get(i));
        }

    }
}
