package battleStory;

import java.util.ArrayList;

public class Sling extends Weapon implements Container {
    private ArrayList<Entity> containedItems = new ArrayList<>();

    public Sling() {
        setName("basic sling");
    }

    public String getAddingMessage(Entity entity) {
        return "loads a " + entity + " into the " + this.getName();
    }

    public String getCannotAddMessage(Entity entity) {
        return "cannot fit a " + entity + "into the " + this.getName();
    }

    public String getWithdrawingMessage(Entity entity) {
        return "takes a " + entity + " from the " + this.getName();
    }

    public boolean isEmpty() {
        if (containedItems.size() == 0) {
            return true;
        }
        return false;
    }

    public ArrayList<Entity> getContainedItems() {
        return containedItems;
    }

    @Override
    public boolean removeItem(Entity entity) {
       int i;
       for (i = 0; i < containedItems.size(); i++) {
           if (containedItems.get(i).equals(entity)) {
               containedItems.remove(i);
               return true;
           }
       }
       return false;
    }

    @Override
    public boolean addItem(Entity entity) {
        int i;
        if (this.isEmpty()) {
            for (double dim : entity.getDimensions()) {
                if (dim > 5.0) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }


	//TODO: Implement abstract methods

    @Override
    public boolean attack(Entity entityToAttack, double distanceInMeters) {
        //TODO: check if contents in sling, if so remove object in contents
        //, set not full, call parent method

        if (this.isEmpty()) {
            return false;
        }

        containedItems.remove(0);
        super.attack(entityToAttack, distanceInMeters);
        return true;
    }

    //TODO: override ToString to contain parent ToString() plus contents of the sling
    @Override
    public String toString() {
        int i = 0;
        String outputString = super.toString();

        outputString += "The " + this.getName() + " contains:\n";
        for (i = 0; i < containedItems.size(); i++) {
            outputString += "    A " + containedItems.get(i) + "\n";
        }
        return outputString;
    }
}

