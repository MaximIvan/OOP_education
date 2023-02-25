package items;

import armor.Armor;
import weapons.Bow;
import armor.easyArmor;

public class Archer extends Warrior<Bow> implements DistanceAttacker {

    private int distance;
    private Armor armor;

    public Archer(String name, Bow weapon, Armor armor) {
        super(name, weapon);
        this.armor = armor;
        distance = weapon.getDistance() + rnd.nextInt(10);
    }

    public int getDistance() {
        return distance;
    }

    public Armor getArmor() {
        return armor;
    }

    @Override
    public String toString() {
        return super.toString() + " Type = Archer{" + "distance=" + distance + ", blockDamage= " + armor + '}';
    }
}

