package Chapter4.Lab43;

public class BandBooster {

    String name;
    int boxesSold;

    public BandBooster(String bandBoosterName) {
        name = bandBoosterName;
        boxesSold = 0;
    }

    public String getName() {
        return name;
    }

    public void updateSales(int addBoxes) {
       boxesSold += addBoxes;
    }

    public String toString() {
        return name + ": " + boxesSold + " boxes";
    }

}
