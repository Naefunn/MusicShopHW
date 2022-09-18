package ShopItems;

public class Piano extends Instrument{
    private int numOfKeys;
    private String keyMaterial;

    public Piano(double buyPrice, double sellPrice, String material, String colour, String type, int numOfKeys, String keyMaterial) {
        super(buyPrice, sellPrice, material, colour, type);
        this.numOfKeys = numOfKeys;
        this.keyMaterial = keyMaterial;
    }

    public int getNumOfKeys() {
        return numOfKeys;
    }

    public void setNumOfKeys(int numOfKeys) {
        this.numOfKeys = numOfKeys;
    }

    public String getKeyMaterial() {
        return keyMaterial;
    }

    public void setKeyMaterial(String keyMaterial) {
        this.keyMaterial = keyMaterial;
    }

    @Override
    public String play(){
        return "Dink";
    }
}
