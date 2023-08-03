public class Ball {

    private static int bounceCount;
    private static int totalBounces;
    private static int numOfBalls;

    public Ball() {
        numOfBalls++;
    }

    public void bounce() {
        bounceCount++;
        totalBounces++;
    }

    public static int getTotalBounces() {
        return totalBounces / numOfBalls;
    }

    public void reset(int count) {
        bounceCount = count;
        totalBounces -= bounceCount;
        totalBounces += count;
    }

}
