package CSE114.JavaTest.test;

public class Test{
    private int height;

    public Test(int height){
        this.height = height;
    }
    public void Height() {
        this.height = 10;
    }
    public int getHeight() {
        return this.height;
    }
    public void setHeight(int height) {
        this.height = height; // "this.height"는 인스턴스 변수를 가리킴
        System.out.println(height); // "height"는 매개변수를 가리킴
    }
}
