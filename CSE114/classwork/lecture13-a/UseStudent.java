public class UseStudent {

    public static void main(String[] args) {

        final int N = 10;
	//        Student[] students = new Student[N];
        Student[] students = {new Student(1, "Student1"),
	    new Student(2, "Student2"),
	    new Student(3, "Student3"),
	    new Student(4, "Student4"),
	    new Student(5, "Student5")};

	//        for (int i = 0; i < N; i++) {
	//            students[i] = new Student(i, "Student" + i);
	//        }

        ArrayTools.printArray(students, "Students:");
    }

}
