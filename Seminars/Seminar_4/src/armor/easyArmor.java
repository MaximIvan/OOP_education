package armor;

public class easyArmor implements Armor {
    private int blockDamage;

    public int blockDamage() {
        return 35;
    }

    @Override
    public String toString() {
        return "easyArmor(helmet & chain mail) blockDamage= " + blockDamage();
    }
}
