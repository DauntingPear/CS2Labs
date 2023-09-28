package battleStory;

abstract class Weapon extends Entity implements Attacker {

    private int damage;
    private double hitBonus;
    private String hitMessage;
    private String missMessage;

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    public void setHitBonus(double hitBonus) {
        this.hitBonus = hitBonus;
    }

    public double getHitBonus() {
        return hitBonus;
    }

    public void setHitMessage(String hitMessage) {
        this.hitMessage = hitMessage;
    }

    public String getHitMessage(Entity entity) {
        return hitMessage;
    }

    public void setMissMessage(String missMessage) {
        this.missMessage = missMessage;
    }

    public String getMissMessage() {
        return missMessage;
    }


    public boolean attack(Entity entityToAttack, double distanceInMeters) {
       return entityToAttack.receiveAttack(this, distanceInMeters);
    }


	//TODO: add implemented attack method

	//TODO: add non-implemented abstract methods from interface Attacker
}
