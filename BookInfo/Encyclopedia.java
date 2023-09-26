package BookInfo;

public class Encyclopedia extends Book {
  // TODO: Declare private fields
  private String edition;
  private int numPages;


  public void setEdition(String edition) {
    this.edition = edition;
  }

  public void setNumPages(int numPages) {
    this.numPages = numPages;
  }

  public String getEdition() {
    return edition;
  }

  public int getNumPages() {
    return numPages;
  }

  @Override
  public void printInfo() {
    super.printInfo();
    System.out.println("   Edition: " + edition);
    System.out.println("   Number of Pages: " + numPages);
  }
}
