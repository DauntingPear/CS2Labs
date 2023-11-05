import java.util.Scanner;
import java.util.ArrayList;

public class DataVisualizer {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        ArrayList<String[]> dataPoints = new ArrayList<String[]>();

        String title;
        System.out.println("Enter a title for the data:");
        title = scnr.nextLine();
        System.out.println("You entered: " + title + "\n");


        String col1h;
        String col2h;

        System.out.println("Enter the column 1 header:");
        col1h = scnr.nextLine();
        System.out.println("You entered: " + col1h + "\n");

        System.out.println("Enter the column 2 header:");
        col2h = scnr.nextLine();
        System.out.println("You entered: " + col2h + "\n");

        String input;
        String[] data;
        System.out.println("Enter a data point (-1 to stop input):");
        input = scnr.nextLine();


        while (!input.equals("-1")) {
            Boolean good = true;
            data = input.split(",");
            if (data.length > 2) {
                System.out.println("Error: Too many commas in input.\n");
                good = false;
            }
            else {
                try {
                    String val = data[1].replaceAll("\\s+", "");
                    int intVal = Integer.parseInt(val);
                }
                catch (NumberFormatException e) {
                    System.out.println("Error: Comma not followed by an integer.\n");
                    good = false;
                }
                catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Error: No comma in string.\n");
                    good = false;
                }
            }

            if (good) {
                System.out.println("Data string: " + data[0]);
                data[1] = data[1].replaceAll("\\s+", "");
                System.out.println("Data integer: " + data[1]);
                System.out.println();
                dataPoints.add(data);
            }


            System.out.println("Enter a data point (-1 to stop input):");
            input = scnr.nextLine();
        }
        System.out.println();

        int i;

        System.out.printf("%33s\n", title);
        System.out.printf("%-20s|%23s\n", col1h, col2h);
        System.out.printf("--------------------------------------------\n");

        for (i = 0; i < dataPoints.size(); i++) {
            String data1 = dataPoints.get(i)[0];
            String data2 = dataPoints.get(i)[1];

            System.out.printf("%-20s|%23s\n", data1, data2);
        }
        System.out.println();


        for (i = 0; i < dataPoints.size(); i++) {
            String data1 = dataPoints.get(i)[0];
            int data2 = Integer.parseInt(dataPoints.get(i)[1]);

            System.out.printf("%20s ", data1);
            int j;
            for (j = 0; j < data2; j++) {
                System.out.printf("*");
            }
            System.out.printf("\n");

        }


    }
}
