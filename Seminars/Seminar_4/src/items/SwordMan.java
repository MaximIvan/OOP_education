package items;

import armor.Armor;
import armor.heavyArmor;
import weapons.Sword;


public class SwordMan extends Warrior<Sword, heavyArmor> {

    private Armor armor;
    private int blockDamage;

    public SwordMan(String name, Sword weapon, heavyArmor armor) {
        super(name, weapon, armor);
        blockDamage = armor.getBlockDamage();
    }

    public int getBlockDamage() {
        return blockDamage;
    }

    @Override
    public String toString() {
        return super.toString() + " Type = SwordMan, ";
    }
}
