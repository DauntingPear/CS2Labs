package ShoppingCartP2;

import java.util.ArrayList;

/**
 *
 * A class representing a Shopping Cart
 * @author Adrian Brady
 * @version 1.0.0
 *
 */
public class ShoppingCart {
  private String customerName;
  private String currentDate;
  private ArrayList<ItemToPurchase> cartItems = new ArrayList<ItemToPurchase>();

  public ShoppingCart() {
    customerName = "none";
    currentDate = "January 1, 2016";
  }

  public ShoppingCart(String name, String date) {
    customerName = name;
    currentDate = date;
  }

  /**
   * Returns the customer name
   * @return String customerName
   */
  public String getCustomerName() {
    return customerName;
  }

  /**
   * Returns the date
   * @return String currentDate
   */
  public String getDate() {
    return currentDate;
  }

  /**
   * Adds an item to the cart
   * @param item an item of type ItemToPurchase
   */
  public void addItem(ItemToPurchase item) {
    cartItems.add(item);
  }

  /**
   * Removes the first occurance of an item matching the given String
   * @param itemName a String to remove
   */
  public void removeItem(String itemName) {
    int numItems = cartItems.size();
    int i;
    for (i = 0; i < numItems; i++) {
      if (cartItems.get(i).getName().equals(itemName) == true) {
        cartItems.remove(i);
        return;
      }
    }
    System.out.println("Item not found in cart. Nothing removed");
  }

  /**
   * Determines if the passed in item has the same name as an item in the cart
   * and if it does, changes parameters of the item in the cart if the
   * cart item has default parameters
   * @param item the item to update the cart item with
   */
  public void modifyItem(ItemToPurchase item) {
    int numItems = cartItems.size();
    int i;
    boolean changed = false;
    for (i = 0; i < numItems; i++) {
      ItemToPurchase currentItem = cartItems.get(i);
      if (currentItem.getName().equals(item.getName())) {

        /**
        if (currentItem.getDescription().equals(new ItemToPurchase().getDescription()) != true) {
          currentItem = cartItems.get(i);
          currentItem.setDescription(item.getDescription());
          cartItems.set(i, currentItem);
          changed = true;
        }
        if (currentItem.getPrice() != new ItemToPurchase().getPrice()) {
          cartItems.get(i).setPrice(item.getPrice());
          changed = true;
        }*/
        if (currentItem.getQuantity() != new ItemToPurchase().getQuantity()) {
          currentItem = cartItems.get(i);
          currentItem.setQuantity(item.getQuantity());
          changed = true;
        }
        break;
      }
    }
    
    if (changed == false) {
      System.out.println("Item not found in cart. Nothing modified.");
    }
  }

  /**
   * Returns the quantity of all items in the cart
   * @return total
   */
  public int getNumItemsInCart() {
    int numItems = cartItems.size();
    int i;
    int total = 0;
    for (i = 0; i < numItems; i++) {
      total += cartItems.get(i).getQuantity();
    }
    return total;

  }

  /**
   * Returns the total cost of items in the cart
   * @return total
   */
  public int getCostOfCart() {
    int numItems = cartItems.size();
    int i;
    int total = 0;
    int quantity;
    int price;
    for (i = 0; i < numItems; i++) {
      quantity = cartItems.get(i).getQuantity();
      price = cartItems.get(i).getPrice();
      total += price * quantity;
    }
    return total;
  }

  public void printTotal() {
    int numItems = cartItems.size();
    int i;
    System.out.println(customerName + "'s Shopping Cart - " + currentDate);
    System.out.println("Number of Items: " + this.getNumItemsInCart() + "\n");
    for (i = 0; i < numItems; i++) {
      cartItems.get(i).printItemCost();
    }
    if (numItems == 0) {
      System.out.println("SHOPPING CART IS EMPTY");
    }
    System.out.println("\nTotal: $" + this.getCostOfCart());
  }

  public void printDescriptions() {
    int numItems = cartItems.size();
    int i;
    System.out.println(customerName + "'s Shopping Cart - " + currentDate + "\n");
    System.out.println("Item Descriptions");

    for (i = 0; i < numItems; i++) {
      cartItems.get(i).printItemDescription();
    }
  }



}
