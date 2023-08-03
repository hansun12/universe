public class Player {

   private int no;
   private String position;
   private String name;
   private String height;
   private int weight;
   private String bats;
   private double ave;

   // Constructor
   public Player(int n, String pos, String nm, String h,
                 int w, String bts, double average) {
      no = n;
      position = pos;
      name = nm;
      height = h;
      weight = w;
      bats = bts;
      ave = average;
   }

   // Getters (Readers)

   public int getNumber() {
      return no;
   }

   public String getPosition() {
      return position;
   }

   public String getName() {
      return name;
   }

   public String getHeight() {
      return height;
   }

   public int getWeight() {
      return weight;
   }

   public String getBats() {
      return bats;
   }

   public double getAverage() {
      return ave;
   }

   // Setters (Writers)

   public void setPosition(String newpos) {
      position = newpos;
   }

   public void setName(String newname) {
      name = newname;
   }

   public void setHeight(String newheight) {
      height = newheight;
   }

   public void setWeight(int newweight) {
      weight = newweight;
   }

   public void setBats(String newbats) {
      bats = newbats;
   }

   public void setAverage(double newave) {
      ave = newave;
   }

   // Other methods

   public String toString() {
      return
              "(" +
                      no + ", " +
                      position + ", " +
                      name + ", " +
                      height + ", " +
                      weight + ", " +
                      bats + ", " +
                      ave +
                      ")";
   }

}