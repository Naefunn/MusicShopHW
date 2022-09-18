import Interfaces.ISell;
import  ShopItems.*;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;

public class MusicShopTest {

    Bass myBass;
    Drum myDrum;
    Guitar myGuitar;
    Piano myPiano;
    MusicShop myMusicShop;

    @Before
    public void setUp(){
        myBass = new Bass(50.00, 100.00, "Wood", "Brown", "String", 4);
        myDrum = new Drum(100.00, 200.00, "Metal", "Red", "Percussion", 7);
        myGuitar = new Guitar(75.00, 100, "Wood", "Sunburst", "String", 6, true);
        myPiano = new Piano(1000.00, 2000.00, "Wood", "Black", "String", 88, "Ivory");
        ArrayList<ISell> testStock = new ArrayList<ISell>(){
            {
                add(myBass);
                add(myGuitar);
                add(myDrum);
                add(myPiano);
            }
        };

        myMusicShop = new MusicShop(testStock);

    }

    @Test
    public void canGetStockSize(){
        assertEquals(4, myMusicShop.getStockSize());
    }

    @org.junit.Test
    public void addToStock() {
        myMusicShop.addItemToStockList(myPiano);
        assertEquals(5, myMusicShop.getStockSize());
    }

    @org.junit.Test
    public void removeFromStock() {
        myMusicShop.removeItemFromStockList(myGuitar);
        assertEquals(3, myMusicShop.getStockSize());
    }




}
