public class useBall {
    public static void main(String[] args) {
        Ball b1 = new Ball();
        Ball b2 = new Ball();
        b1.bounce();
        b2.bounce();
        System.out.println(Ball.getTotalBounces());
    }
}
