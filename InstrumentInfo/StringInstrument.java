package InstrumentInfo;

// TODO: Define a class: StringInstrument that is derived from the Instrument class
public class StringInstrument extends Instrument {
  private int numStrings;
  private int numFrets;
  private boolean isBowed;

  // TODO: Define mutator methods - 
  //       setNumOfStrings(), setNumOfFrets(), setIsBowed()
  public void setNumOfStrings(int numStrings) {
    this.numStrings = numStrings;
  }

  public void setNumOfFrets(int numFrets) {
    this.numFrets = numFrets;
  }

  public void setIsBowed(boolean isBowed) {
    this.isBowed = isBowed;
  }


  // TODO: Define accessor methods - 
  //       getNumOfStrings(), getNumOfFrets(), getIsBowed()
  public int getNumOfStrings() {
    return numStrings;
  }

  public int getNumOfFrets() {
    return numFrets;
  }

  public boolean getIsBowed() {
    return isBowed;
  }

}


