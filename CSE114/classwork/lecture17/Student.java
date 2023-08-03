public class Student {

    private int id;
    private String name;

    public Student (int initId, String initName) {
        id = initId;
        name = initName;
    }

    public int getId () {
        return id;
    }

    public String getName () {
        return name;
    }

    public void setId (int id) {
        this.id = id;
    }
    
    public String toString () {
        return id + " " + name;
    }

    public boolean equals (Object obj) {
        return (id + name).length() == (((Student)obj).id +
                                        ((Student)obj).name).length();
    }

}
