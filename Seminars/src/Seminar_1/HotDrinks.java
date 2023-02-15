package Seminar_1;

public class HotDrinks extends Product{

    private String volume;

    public HotDrinks(String name, double cost, String volume) {
        super(name, cost);
        this.volume = volume;
    }

    @Override
    public String toString() {
        StringBuilder localString = new StringBuilder(super.toString());
        localString.append(String.format("объем: %s", volume.toString()));
        return localString.toString();
    }
}

