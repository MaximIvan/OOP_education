package items;

import armor.Armor;
import armor.heavyArmor;
import weapons.Sword;


public class SwordMan extends Warrior<Sword, heavyArmor> {

    private Armor armor;

    public SwordMan(String name, Sword weapon, heavyArmor armor) {
        super(name, weapon, armor);
    }

    public Armor getArmor() {
        return armor;
    }

    @Override
    public String toString() {
        return super.toString() + " Type = SwordMan, ";
    }
}
