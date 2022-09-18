package ShopItems;

import Interfaces.IPlay;
import Interfaces.ISell;

public abstract class Instrument extends ShopItem implements IPlay, ISell {
    protected String material;
    protected String colour;
    protected String type;

    public Instrument(double buyPrice, double sellPrice, String material, String colour, String type) {
        super(buyPrice, sellPrice);
        this.material = material;
        this.colour = colour;
        this.type = type;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
