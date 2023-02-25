package armor;

public class heavyArmor implements Armor {

    private int blockDamage;

    public int blockDamage() {
        return 80;
    }

    @Override
    public int getBlockDamage() {
        return 80;
    }

    @Override
    public String toString() {
        return "heavyArmor(helmet, chain mail, shield) blockDamage= " + blockDamage();
    }
}
