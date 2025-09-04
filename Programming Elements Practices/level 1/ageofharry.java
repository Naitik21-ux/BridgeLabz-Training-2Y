import java.util.Scanner;

public class ageofharry {
   public ageofharry() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      int var2 = var1.nextInt();
      short var3 = 200;
      System.out.println("The current age of Harry is" + (var2 - var3));
      var1.close();
   }
}