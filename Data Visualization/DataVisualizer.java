import java.util.Scanner;
import java.util.ArrayList;

public class DataVisualizer {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      String col1h;
      String col2h;

      System.out.println("Enter column 1 header:");
      col1h = scnr.nextLine();
      System.out.println("You entered: " + col1h);

      System.out.println("Enter column 2 header:");
      col2h = scnr.nextLine();
      System.out.println("You entered: " + col2h);

   }
}

