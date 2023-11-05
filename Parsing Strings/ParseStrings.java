import java.util.Arrays;
import java.util.Scanner;

public class ParseStrings {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String input;
      String[] words;
      Boolean print = true;
      System.out.println("Enter input string:");
      input = scnr.nextLine();

      while (!input.equals("q")) {
          if (!input.contains(",")) {
              System.out.println("Error: No comma in string.\n");
              print = false;
          }

          words = input.split(",");
          if (words.length != 2) {
              print = false;
          }

          if (print == true) {
              System.out.println("First word: " + words[0].replaceAll("\\s+", ""));
              System.out.println("Second word: " + words[1].replaceAll("\\s+", "") + "\n");
          }
          System.out.println("Enter input string:");
          input = scnr.nextLine();
      }
   }
}

