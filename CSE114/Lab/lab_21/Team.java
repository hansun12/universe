public class Team {

   private int CAPACITY = 50;
   private Player[] players;
   private int size;
   private String name;

   public Team(String teamName) {
      name = teamName;
      players = new Player[CAPACITY];
      size = 0;
   }

   public void addPlayer(int no, String pos, String name, String height,
                         int weight, String bats, double ave) {
      if (size > CAPACITY) {
         System.out.println("There is no more room to add a new player");
         return;
      }
      Player p = new Player(no, pos, name, height, weight, bats, ave);
      players[size] = p;
      size = size + 1;
   }

   public double battingAverage() {
      double sum = 0.0;
      for (int i = 0; i < size; i++) {
         sum = sum + players[i].getAverage();
      }
      return sum / size;
   }


   public double battingAverageMinusPitchers() {
      double sum = 0.0;
      int num = 0;
      for (int i = 0; i < size; i++) {
         if (!((players[i].getPosition()).equals("P"))) {
            num = num + 1;
            sum = sum + players[i].getAverage();
         }
      }
      return sum / num;
   }


   public String heightAverage() {
      int sum = 0;  // in inches
      for (int i = 0; i < size; i++) {
         sum = sum + Useful.feetInches2Inches(players[i].getHeight());
      }
      int ave = (int) (sum / size);
      return Useful.inches2FeetInches(ave);
   }

   public int numberOfPlayersBatting(String bts) {
      int count = 0;
      for (int i = 0; i < size; i++) {
         if ((players[i].getBats()).equals(bts)) {
            count++;
         }
      }
      return count;
   }

   public int numberOfPlayersInPosition(String pos) {
      int count = 0;
      for (int i = 0; i < size; i++) {
         if ((players[i].getPosition()).equals(pos)) {
            count++;
         }
      }
      return count;
   }


   public Player searchPlayer(String name) {
      for (int i = 0; i < size; i++) {
         if ((players[i].getName()).equals(name)) {
            return players[i];
         }
      }
      System.out.println("Player named " + name + " is not on the team");
      return null;
   }

   public static void main(String[] args) {

      System.out.println(Useful.feetInches2Inches("6-3"));
      System.out.println(Useful.inches2FeetInches(Useful.feetInches2Inches("6-3")));
   }

}
