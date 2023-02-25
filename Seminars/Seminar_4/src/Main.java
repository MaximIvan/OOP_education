import armor.easyArmor;
import armor.heavyArmor;
import items.Archer;
import items.SwordMan;
import items.Warrior;
import team.Team;
import weapons.Bow;
import weapons.Sword;

public class Main {
    public static void main(String[] args) {
        Team<Archer> archerTeam = new Team<>("Archers");
        archerTeam.addWarrior(new Archer("Vasya", new Bow(), new easyArmor()))
                .addWarrior(new Archer("Petya", new Bow(), new easyArmor()))
                .addWarrior(new Archer("Misha", new Bow(), new easyArmor()))
                .addWarrior(new Archer("Grisha", new Bow(), new easyArmor()));

        System.out.println(archerTeam);

        Team<Warrior> mixTeam = new Team<>("Mixer");
        mixTeam.addWarrior(new Archer("Vasya", new Bow(), new easyArmor()))
                .addWarrior(new SwordMan("Petya", new Sword(), new heavyArmor()))
                .addWarrior(new Archer("Misha", new Bow(), new easyArmor()))
                .addWarrior(new SwordMan("Grisha", new Sword(), new heavyArmor()));

        System.out.println(mixTeam);

        SwordMan greg = new SwordMan("Petya", new Sword(), new heavyArmor());
        Archer misha = new Archer("Misha", new Bow(), new easyArmor());

        while (greg.getHealthPoint() > 0 && misha.getHealthPoint() > 0) {
            int damage2 = misha.hitDamage(greg);
            System.out.printf("Здоровье Гриши: %d Здоровье Миши: %d \n", greg.getHealthPoint(), misha.getHealthPoint());
            if (greg.getHealthPoint() <= 0) {
                System.out.println("Миша победил");
                break;
            }
            int damage1 = greg.hitDamage(misha);
            System.out.printf("Здоровье Гриши: %d Здоровье Миши: %d \n", greg.getHealthPoint(), misha.getHealthPoint());
            if (misha.getHealthPoint() <= 0) {
                System.out.println("Гриша победил");
                break;
            }
        }
    }
}