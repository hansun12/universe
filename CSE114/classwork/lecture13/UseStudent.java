public class UseStudent {

    public static void main(String[] args) {

        final int N = 10;
        Student[] students = new Student[N];

        for (int i = 0; i < N; i++) {
            students[i] = new Student(i, "Student" + i);
        }

        ArrayTools.printArray(students, "Students:");
    }

}
