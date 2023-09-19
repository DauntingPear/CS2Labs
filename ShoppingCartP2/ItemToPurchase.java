package ShoppingCartP2;

public class ItemToPurchase {
  private String itemName;
  private int itemPrice;
  private int itemQuantity;
  private String itemDescription;

  public ItemToPurchase() {
    itemName = "none";
    itemPrice = 0;
    itemQuantity = 0;
    itemDescription = "none";
  }

  public ItemToPurchase(String itemName, String itemDescription, int itemPrice, int itemQuantity) {
    this.itemName = itemName;
    this.itemDescription = itemDescription;
    this.itemPrice = itemPrice;
    this.itemQuantity = itemQuantity;
  }

  public void setName(String itemName) {
    this.itemName = itemName;
  }
  public String getName() {
    return itemName;
  }

  public void setPrice(int itemPrice) {
    this.itemPrice = itemPrice;
  }
  public int getPrice() {
    return itemPrice;
  }

  public void setQuantity(int itemQuantity) {
    this.itemQuantity = itemQuantity;
  }
  public int getQuantity() {
    return itemQuantity;
  }

  public void setDescription(String itemDescription) {
    this.itemDescription = itemDescription;
  }

  public String getDescription() {
    return itemDescription;
  }

  public void printItemCost() {
    System.out.print(itemName + " ");
    System.out.print(itemQuantity + " @ $");
    System.out.print(itemPrice + " = $");
    System.out.print(itemQuantity*itemPrice + "\n");
  }

  public void printItemDescription() {
    System.out.print(itemName + ": ");
    System.out.print(itemDescription + "\n");
  }



}


