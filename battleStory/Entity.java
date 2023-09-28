package battleStory;

import java.util.Random;

public abstract class Entity implements Attackable {
    private double[] dimensions;
    private int health = 1;
    private int damageReduction = 0;
    private double evadePercent = 0.0;
    private boolean destroyed = false;
    private String name = "(no name)";
    private String description = "(no description)";
    private Random random;

    private static final boolean DEBUG = false;

	// TODO: add getters and setters
	
	// TODO: implement interface methods

    public void setSeed(int seed) {
        random = new Random(seed);
    }

    protected Attacker downcastToAttacker(Entity entity) {
        if(entity instanceof Attacker) return (Attacker) entity;
        else return null;
    }

    @Override
    public boolean isHit(Entity entityAttacking) {
        return isHit(entityAttacking, 0);
    }

    @Override
    public boolean isHit(Entity entityAttacking, double distanceInMeters) {
        Attacker attacker = downcastToAttacker(entityAttacking);
        double chanceToHit = .5 - getEvadePercent();

        if(attacker != null) chanceToHit += attacker.getHitBonus();

        if(DEBUG) System.out.println("\nChance to hit: " + chanceToHit);

        double attackRoll = random.nextDouble();

        if(DEBUG) System.out.println("Attack Roll: " + attackRoll + "\n");

        if(attackRoll <= chanceToHit) return true;

        return false;
    }

    @Override
    public boolean receiveAttack(Entity entityAttacking) {
        return receiveAttack(entityAttacking, 0);
    }

    @Override
    public boolean receiveAttack(Entity entityAttacking, double distanceInMeters) {
        boolean isHit = isHit(entityAttacking,distanceInMeters);

        if(isHit) {
            int distanceDamageReduction = (int) distanceInMeters;
            int possibleDamage = -(distanceDamageReduction + getDamageReduction());

            Attacker attacker = downcastToAttacker(entityAttacking);

            if (attacker != null) {
                possibleDamage += attacker.getDamage();
            }

            if(possibleDamage < 1) possibleDamage = 1;

            if(DEBUG) System.out.println("Possible Damage: " + possibleDamage);

            int damage = random.nextInt(possibleDamage + 1);

            if(DEBUG) System.out.println("Damage Roll: " + damage + "\n");

            setHealth(getHealth() - damage);

            if (getHealth() <= 0) {
                setDestroyed(true);
            }
        }

        return isHit;
    }

    // TODO: override Object class' toString()
}

