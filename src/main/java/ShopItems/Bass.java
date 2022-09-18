package ShopItems;

public class Bass extends Instrument{
    private int numOfStrings;

    public Bass(double buyPrice, double sellPrice, String material, String colour, String type, int numOfStrings) {
        super(buyPrice, sellPrice, material, colour, type);
        this.numOfStrings = numOfStrings;
    }

    public int getNumOfStrings() {
        return numOfStrings;
    }

    public void setNumOfStrings(int numOfStrings) {
        this.numOfStrings = numOfStrings;
    }

    @Override
    public String play(){
        return "bom";
    }
}
