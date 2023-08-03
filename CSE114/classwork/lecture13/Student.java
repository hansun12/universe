// This is a very simple representation for student objects.
//
public class Student {

    private int id;
    private String name;

    public Student(int initId, String initName) {
        id = initId;
        name = initName;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}
