package zoo;

public class Leo extends Predator implements Runable {
    private int runSpeed = 300;
    public Leo(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "Rrrr!";
    }

    @Override
    public int getSpeedRun() {
        return this.runSpeed;
    }
}
