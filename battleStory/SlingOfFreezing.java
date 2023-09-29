package battleStory;

public class SlingOfFreezing extends Sling {
    private static double maxDimensions = 10.0;
   //TODO: override specified methods with default values
   
    @Override
    public double getHitBonus() {
        return 0.2;
    }

    @Override
    public int getDamage() {
        return 25;
    }

    @Override
    public String getName() {
        return "sling of freezing";
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
}
