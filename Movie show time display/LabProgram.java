import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.IOException;

public class LabProgram {
    public static void main(String[] args) throws IOException {
        Scanner scnr = new Scanner(System.in);

        String fileName = scnr.next();

        File file = new File(fileName);

        try(FileInputStream fis = new FileInputStream(file); Scanner fileScan = new Scanner(fis);) {
            String times = "";
            String lastTitle = "";
            String lastRating = "";

            while (fileScan.hasNext()) {
                String line = fileScan.nextLine();
                //System.out.println(line);

                String[] tokens = line.split(",");
                
                String title = tokens[1];
                String rating = tokens[2];
                //System.out.println(title + "<>" + rating);

                if(title.length() > 44) title = title.substring(0, 44);

                if (!lastTitle.equals("") && !title.equals(lastTitle)) {
                    System.out.printf("%-44s | %5s | %s\n", lastTitle, lastRating, times);
                    times = "";
                }

                lastRating = rating;
                lastTitle = title;

                if (!times.equals("")) times += " ";
                times += tokens[0];
            }

            System.out.printf("%-44s | %5s | %s\n", lastTitle, lastRating, times);
        }
        catch (FileNotFoundException ex) {
            //handle
        }
        catch (IOException ex) {
            //handle
        }

    }
}

