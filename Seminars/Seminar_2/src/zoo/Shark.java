package zoo;

public class Shark extends Predator implements Waterfowl{
    private int swimSpeed = 25;
    public Shark(String name) {
        super (name);
    }

    @Override
    public String say() {
        return "Arghhh";
    }

    @Override
    public int getSpeedWaterfowl() {
        return this.swimSpeed;
    }
}
