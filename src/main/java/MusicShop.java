import Interfaces.ISell;

import java.util.ArrayList;

public class MusicShop {
    private ArrayList<ISell> stockList;

    public MusicShop(ArrayList<ISell> stockList) {
        this.stockList = stockList;
    }

   public int getStockSize(){
        return stockList.size();
   }

   public void addItemToStockList(ISell shopItem){
        stockList.add(shopItem);
   }

   public boolean removeItemFromStockList(ISell shopItem){
        return stockList.remove(shopItem);
   }

}
