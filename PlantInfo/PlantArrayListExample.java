package PlantInfo;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class PlantArrayListExample {

   // TODO: Define a printArrayList method that prints an ArrayList of plant (or flower) objects                                                       
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String input;
      ArrayList<Plant> myGarden = new ArrayList<Plant>();
      // TODO: Declare an ArrayList called myGarden that can hold object of type plant

      String plantName;
      String plantCost;
      String flowerName;
      String flowerCost;
      String colorOfFlowers;
      boolean isAnnual;

      // TODO: Declare variables - plantName, plantCost, flowerName, flowerCost, colorOfFlowers, isAnnual
      
      input = scnr.next();
      while(!input.equals("-1")){
         // TODO: Check if input is a plant or flower
         //       Store as a plant object or flower object
         //       Add to the ArrayList myGarden
         if (input.equals("plant")) {
             Plant inputPlant = new Plant();
             plantName = scnr.next();
             inputPlant.setPlantName(plantName);
             plantCost = scnr.next();
             inputPlant.setPlantCost(plantCost);
             myGarden.add(inputPlant);
         }
         else if (input.equals("flower")) {
           Flower inputPlant = new Flower();
           flowerName = scnr.next();
           inputPlant.setPlantName(flowerName);
           flowerCost = scnr.next();
           inputPlant.setPlantCost(flowerCost);
           isAnnual = scnr.nextBoolean();
           inputPlant.setPlantType(isAnnual);
           colorOfFlowers = scnr.next();
           inputPlant.setColorOfFlowers(colorOfFlowers);
           myGarden.add(inputPlant);
         }
      
         input = scnr.next();
      }

      int i;
      for (i = 0; i < myGarden.size(); i++) {
        System.out.println("Plant " + (i+1) + " Information: ");
        myGarden.get(i).printInfo();
        System.out.println();
      }
      
      
      // TODO: Call the method printArrayList to print myGarden
      
   }
}

