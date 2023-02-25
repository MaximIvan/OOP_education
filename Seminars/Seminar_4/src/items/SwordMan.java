package items;

import armor.Armor;
import armor.heavyArmor;
import weapons.Sword;


public class SwordMan extends Warrior<Sword> {

    private Armor armor;

    public SwordMan(String name, Sword weapon, Armor armor) {
        super(name, weapon);
        this.armor = armor;
    }

    public Armor getArmor() {
        return armor;
    }

    @Override
    public String toString() {
        return super.toString() + " Type = SwordMan, ";
    }
}
