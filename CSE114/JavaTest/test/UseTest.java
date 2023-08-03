package CSE114.JavaTest.test;

public class UseTest {
    public static void main(String[] args) {
        Test test = new Test(170);
        test.Height();
        System.out.println(test.getHeight());
        test.setHeight(180);
        // System.out.println(test.getHeight());
    }
}
