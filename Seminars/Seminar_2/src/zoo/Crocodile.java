package zoo;

import java.io.Flushable;

public class Crocodile extends Predator implements Runable, Flyable, Waterfowl {
    private int flightSpeed = 15;
    private int flightHing = 5;
    private int runSpeed = 100;

    private int swimSpeed = 15;

    public Crocodile(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "Shhhhh";
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
