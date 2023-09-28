package battleStory;

public class SlingOfFreezing extends Sling {
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
        return "Sling of freezing";
    }

    @Override
    public boolean addItem(Entity entity) {
        for (double dim : entity.getDimensions()) {
            if (dim > 10.0) {
                return false;
            }
        }
        super.addItem(entity);
        return true;
    }
}
