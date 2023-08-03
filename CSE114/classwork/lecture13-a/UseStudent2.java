public class UseStudent2 {

    public static void main(String[] args) {

        final int N = 10;
	//        Student[] students = new Student[N];
	String studentNames[] = new String[N];
	int studentIds[] = new int[N];

	for (int i = 0; i < N; i++) {
	    studentNames[i] = "Student" + i;
	    studentIds[i] = i;
	}

	for (int i = 0; i < N; i++) {
	    System.out.println("Name: " + studentNames[i] + ", id: " + studentIds[i]);
	}
    }
}
