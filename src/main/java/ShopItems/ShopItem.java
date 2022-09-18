package ShopItems;

import Interfaces.ISell;

public abstract class ShopItem implements ISell {
    protected double buyPrice;
    protected double sellPrice;

    public ShopItem(double buyPrice, double sellPrice) {
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(double buyPrice) {
        this.buyPrice = buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }

    @Override
    public double calculateMarkUp(){
        return sellPrice-buyPrice;
    }
}
