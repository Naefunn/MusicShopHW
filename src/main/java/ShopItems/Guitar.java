package ShopItems;

public class Guitar extends Instrument{
    private int numOfStrings;
    private boolean isElectric;

    public Guitar(double buyPrice, double sellPrice, String material, String colour, String type, int numOfStrings, boolean isElectric) {
        super(buyPrice, sellPrice, material, colour, type);
        this.numOfStrings = numOfStrings;
        this.isElectric = isElectric;
    }

    public int getNumOfStrings() {
        return numOfStrings;
    }

    public void setNumOfStrings(int numOfStrings) {
        this.numOfStrings = numOfStrings;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }

    @Override
    public String play(){
        return "Strum";
    }
}
