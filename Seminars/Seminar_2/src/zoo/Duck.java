package zoo;

public class Duck extends Herbivores implements Flyable, Runable, Waterfowl {
    private int flightSpeed = 15;
    private int flightHing = 5;
    private int runSpeed = 10;
    private int swimSpeed = 3;

    public Duck(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "Krya Krya!";
    }

    @Override
    public int getSpeedFlyable() {
        return this.flightSpeed;
    }

    @Override
    public int getHigh() {
        return this.flightHing;
    }

    @Override
    public int getSpeedRun() {
        return this.runSpeed;
    }

    @Override
    public int getSpeedWaterfowl() {
        return this.swimSpeed;
    }
}
