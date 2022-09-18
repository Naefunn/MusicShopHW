package ShopItems;

public class Drum extends Instrument {
    private int numOfDrums;


    public Drum(double buyPrice, double sellPrice, String material, String colour, String type, int numOfDrums) {
        super(buyPrice, sellPrice, material, colour, type);
        this.numOfDrums = numOfDrums;
    }

    public int getNumOfDrums() {
        return numOfDrums;
    }

    public void setNumOfDrums(int numOfDrums) {
        this.numOfDrums = numOfDrums;
    }

    @Override
    public String play(){
        return "Bang";
    }
}
