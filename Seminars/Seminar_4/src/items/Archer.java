package items;

import armor.Armor;
import weapons.Bow;
import armor.easyArmor;

public class Archer extends Warrior<Bow, easyArmor> implements DistanceAttacker {

    private int distance;
    private static int blockDamage;

    public Archer(String name, Bow weapon, easyArmor armor) {
        super(name, weapon, armor);
        distance = weapon.getDistance() + rnd.nextInt(10);
        blockDamage = armor.getBlockDamage();
    }


    public int getDistance() {
        return distance;
    }

    public int getBlockDamage() {
        return this.blockDamage;
    }

    @Override
    public String toString() {
        return super.toString() + " Type = Archer{" + "distance=" + distance + ", blockDamage= " + blockDamage + '}';
    }
}

