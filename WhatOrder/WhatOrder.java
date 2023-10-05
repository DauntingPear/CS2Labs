package WhatOrder;

import java.util.Scanner;

public class WhatOrder {
    // TODO: Define a generic method called checkOrder() that 
    //       takes in four variables of generic type as arguments. 
    //       The return type of the method is integer
    public static <T extends Comparable<T>> int checkOrder(T item1, T item2, T item3, T item4)  {
        int compare1 = item1.compareTo(item2);
        int compare2 = item2.compareTo(item3);
        int compare3 = item3.compareTo(item4);

        if (compare1 > 0 && compare2 > 0 && compare3 > 0) {
            return 1;
        } else if (compare1 < 0 && compare2 < 0 && compare3 < 0) {
            return -1;
        } else {
            return 0;
        }
    }


    // Check the order of the input: return -1 for ascending, 
    // 0 for neither, 1 for descending



    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        // Check order of four strings
        System.out.println("Order: " + checkOrder(scnr.next(), scnr.next(), scnr.next(), scnr.next())); 

        // Check order of four doubles
        System.out.println("Order: " + checkOrder(scnr.nextDouble(), scnr.nextDouble(), scnr.nextDouble(), scnr.nextDouble()));
    }
}

