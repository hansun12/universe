public class Useful {

   public static int feetInches2Inches(String fi) {
      String[] feetInches = fi.split("[-]");
      int feet = Integer.parseInt(feetInches[0]);
      int inches = Integer.parseInt(feetInches[1]);
      return feet * 12 + inches;
   }

   public static String inches2FeetInches(int inches) {
      int feet = inches / 12;
      inches = inches % 12;
      return "" + feet + "-" + inches;
   }

}
