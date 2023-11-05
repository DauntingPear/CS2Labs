import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class LabProgram {
   public static void main(String[] args) throws IOException {
      Scanner scnr = new Scanner(System.in);
      FileInputStream fileByteStream = null;
      Scanner inFS = null;
      String fileLine;

      fileByteStream = new FileInputStream("movies.csv");
      inFS = new Scanner(fileByteStream);

      while (inFS.hasNextLine()) {
          fileLine = inFS.nextLine();
          System.out.println("Line: " + fileLine);
      }

      fileByteStream.close();

      /* Type your code here. */
   }
}

