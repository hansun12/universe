public class VotingProjection {
    public static void generateResults(String c1, String c2, String c3, int a, int b, int c) {
        String winner = "";
        double percent = 0.0;

        if (a > b && a > c) {
            winner = c1;
            percent = a;
        }
        else if (b > a && b > c) {
            winner = c2;
            percent = b;
        }
        else {
            winner = c3;
            percent = c;
        }
        percent /= (a + b + c);
        percent *= 100;
        System.out.format("Candidate [%s] won with [%.2f]%% of the popular vote.", winner, percent);
    }

    public static void main(String[] args) {
        generateResults("김민성", "조용인", "박태병", 1, 2, 4);
    }
}
