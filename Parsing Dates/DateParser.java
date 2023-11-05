import java.util.InputMismatchException;
import java.util.Scanner;

public class DateParser {
    public static int getMonthAsInt(String monthString) {
        int monthInt;

        // Java switch/case statement                                                                
        switch (monthString) {
            case "January": 
                monthInt = 1; 
                break;
            case "February": 
                monthInt = 2; 
                break;
            case "March": 
                monthInt = 3; 
                break;
            case "April": 
                monthInt = 4; 
                break;
            case "May": 
                monthInt = 5; 
                break;
            case "June": 
                monthInt = 6; 
                break;
            case "July": 
                monthInt = 7; 
                break;
            case "August": 
                monthInt = 8; 
                break;
            case "September": 
                monthInt = 9; 
                break;
            case "October": 
                monthInt = 10; 
                break;
            case "November": 
                monthInt = 11; 
                break;
            case "December": 
                monthInt = 12; 
                break;
            default: 
                monthInt = 0;
        }

        return monthInt;
    }

    // input: March 1, 1990 -> 3-1-1990
    // input: December 13, 2003 -> 12-13-2003
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        Scanner inSS = null;

        String fullDate;
        String monthStr;
        String dateStr;
        int date = 0;
        int year;

        fullDate = scnr.nextLine();

        while (!fullDate.equals("-1")) {
            try {
                inSS = new Scanner(fullDate);
                monthStr = inSS.next();
                int month = getMonthAsInt(monthStr);
                if (month == 0) {
                    throw new InputMismatchException();
                }
                dateStr = inSS.next();
                int dateStrLen = dateStr.length();
                Boolean dateStrLastChar = dateStr.endsWith(",");
                if (dateStrLastChar == true && (dateStrLen == 2 || dateStrLen == 3)) {
                    date = Integer.parseInt(dateStr.substring(0, dateStrLen-1));
                }
                else {
                    throw new InputMismatchException();
                }

                year = inSS.nextInt();
                
                System.out.println(month + "-" + date + "-"+ year);
            }
            catch (InputMismatchException e) {
                
            }
            catch (NumberFormatException e) {

            }
            fullDate = scnr.nextLine();
        }

        inSS.close();
        scnr.close();




        // TODO: Read dates from input, parse the dates to find the ones
        //       in the correct format, and output in m-d-yyyy format

    }
}

