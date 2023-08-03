package withoutInheritance;

public class Person {

    private String name;
    private int ssn;
    private int age;

    public Person (int ssn, String name, int age) {
        this.ssn = ssn;
        this.name = name;
        this.age = age;
    }

    public String getName () {
        return name;
    }

    public int getSSN () {
        return ssn;
    }

    public int age () {
        return age;
    }

    // Try the main below with this definition added once and then
    // with this definition commented out again.
    // Remember that equals is also defined in Object.
    public boolean equals (Object o) {
        System.out.println("equals in Person.");
        return name.equals(((Person)o).name);
    }
    
    public String toString () {
        System.out.println("toString in Person.");
        return name;
    }

    public static void main (String[] args) {

        Person p1 = new Person(529, "Kim Jones", 2001);
        Person p2 = new Person(528, "Kim Jones", 2000);

        System.out.println();
        System.out.println(p1 + 
                           " and " + 
                           p2 +
                           " are equal: True or False? " +
                           p1.equals(p2));
    }
}
