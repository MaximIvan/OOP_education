package items;

import armor.Armor;
import weapons.Weapon;
import java.util.Random;


public abstract class Warrior<T extends Weapon, Z extends Armor> {
    private String name;
    protected T weapon;
    protected Random rnd = new Random();
    private int healthPoint;
    protected Z armor;


    public Warrior(String name, T weapon, Z armor) {
        this.name = name;
        this.weapon = weapon;
        healthPoint = 100;
        this.armor = armor;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public void reduceHealthPoint(int damage) {
        this.healthPoint -= damage;
    }

    public int hitDamage(Warrior enemy) {
        int damage = rnd.nextInt(weapon.damage()) - armor.blockDamage();
        if (damage <= 0) damage = 0;
        enemy.reduceHealthPoint(damage);
        return damage;
    }

    public int getMaxDamage() {
        return weapon.damage();
    }
    public int getBlockDamage() {
        return armor.blockDamage();
    }

    @Override
    public String toString() {
        return "Warrior{" + "name='" + name + '\'' + ", weapon=" + weapon + ", healthPoint=" + healthPoint + '}';
    }
}
