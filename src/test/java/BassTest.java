import ShopItems.Bass;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BassTest {
    Bass myBass;

    @Before
    public void setUp(){
        myBass = new Bass(50.00, 100, "Wood", "Black", "String", 4);
    }

    @Test
    public void canGetMaterial(){
        assertEquals("Wood", myBass.getMaterial());
    }

    @Test
    public void canSetMaterial(){
        myBass.setMaterial("Metal");
        assertEquals("Metal", myBass.getMaterial());
    }

    @Test
    public void canGetColour(){
        assertEquals("Black", myBass.getColour());
    }

    @Test
    public void canSetColour(){
        myBass.setColour("Red");
        assertEquals("Red", myBass.getColour());
    }

    @Test
    public void canGetType(){
        assertEquals("String", myBass.getType());
    }

    @Test
    public void canSetType(){
        myBass.setType("Percussion");
        assertEquals("Percussion", myBass.getType());
    }

    @Test
    public void getBuyPrice() {
        assertEquals(50.00, myBass.getBuyPrice(), 0.0);
    }

    @Test
    public void setBuyPrice() {
        myBass.setBuyPrice(30.0);
        assertEquals(30.0, myBass.getBuyPrice(), 0.0);
    }

    @Test
    public void getSellPrice() {
        assertEquals(100.00, myBass.getSellPrice(), 0.0);
    }

    @Test
    public void setSellPrice() {
        myBass.setSellPrice(80.0);
        assertEquals(80.0, myBass.getSellPrice(), 0.0);
    }

    @Test
    public void calculateMarkup() {
        assertEquals(50.0, myBass.calculateMarkUp(), 0.0);
    }

    @Test
    public void getNumberOfStrings() {
        assertEquals(4, myBass.getNumOfStrings());
    }

    @Test
    public void setNumberOfStrings() {
        myBass.setNumOfStrings(6);
        assertEquals(6, myBass.getNumOfStrings());
    }

    @Test
    public void play() {
        assertEquals("bom", myBass.play());
    }
}
