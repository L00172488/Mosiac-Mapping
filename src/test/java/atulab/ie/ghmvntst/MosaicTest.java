/**
 * 
 */
package atulab.ie.ghmvntst;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * 
 */
public class MosaicTest {

	/**
	 * Test method for {@link atulab.ie.ghmvntst.Mosaic#getName()}.
	 */
	@Test
    public void testGetName() {
        Mosaic mosaic = new Mosaic("Forest Mosaic", 3);// create mosaic with parameters
        String mname = mosaic.getName();//get name
        assertEquals("Forest Mosaic", mname, "Mosaic name should match");//check if the name is as expected
    }
	
	/**
	 * Test method for {@link atulab.ie.ghmvntst.Mosaic#setName(java.lang.String)}.
	 */
	@Test
	public void testSetName() {
        Mosaic mosaic = new Mosaic(); //create mosaic with default constructor
        mosaic.setName("Desert Mosaic");//set the name
        String mname = mosaic.getName();//get updated name
        assertEquals("Desert Mosaic", mname, "Mosaic name should be updated correctly");//check if the name was updated properly
    }


	/**
	 * Test method for {@link atulab.ie.ghmvntst.Mosaic#getNeededItems()}.
	 */
	@Test
	public void testGetNeededItems() {
        Mosaic mosaic = new Mosaic("Forest Mosaic", 3);//create mosaic with parameters
        int neededItems = mosaic.getNeededItems(); //get needed items
        assertEquals(3, neededItems, "Mosaic should require 3 items");//check if the needed items match
    }

	/**
	 * Test method for {@link atulab.ie.ghmvntst.Mosaic#setNeededItems(int)}.
	 */
	@Test
	public void testSetNeededItems() {
        Mosaic mosaic = new Mosaic();//create mosaic with default constructor
        mosaic.setNeededItems(2);//set needed items
        int neededItems = mosaic.getNeededItems();//get updated needed items
        assertEquals(2, neededItems, "Mosaic should require 2 items ");//check if the needed items were updated correctly
    }
	

	/**
	 * Test method for {@link atulab.ie.ghmvntst.Mosaic#isMosaicCompleted()}.
	 */
	@Test
	public void testIsMosaicCompleted() {
        Mosaic mosaic = new Mosaic("Forest Mosaic", 3);//create mosaic
        boolean isCompleted = mosaic.isMosaicCompleted();//retrieve completion status
        assertFalse(isCompleted, "Mosaic should not be completed yet");//check that the mosaic is not completed by default
    }
	/**
	 * Test method for {@link atulab.ie.ghmvntst.Mosaic#setMosaicCompleted(boolean)}.
	 */
	@Test
	public void testSetMosaicCompleted() {
        Mosaic mosaic = new Mosaic("Forest Mosaic", 3);// create mosaic
        mosaic.setMosaicCompleted(true);//set the mosaic as completed
        boolean isCompleted = mosaic.isMosaicCompleted();//retrieve updated completion status
        assertTrue(isCompleted, "Mosaic should be marked as completed"); // check that the mosaic is marked as completed
    }
	
    public void testToString() {
        Mosaic mosaic = new Mosaic("Forest Mosaic", 3); // create mosaic with parameters
        String result = mosaic.toString(); // call the toString method
        
        // The expected output for an incomplete mosaic with 3 shards remaining
        String expected = "Forest Mosaic mosaic shard is not completed yet, 3 shards remaining.";
        
        assertEquals(expected, result, "toString method should display correct status for an incomplete mosaic");
        
        // Now let's complete the mosaic and check the updated status
        mosaic.setMosaicCompleted(true); // set mosaic as completed
        String resultCompleted = mosaic.toString(); // call the toString method again
        
        // Expected output for a completed mosaic
        String expectedCompleted = "Forest Mosaic mosaic shard is completed.";
        
        assertEquals(expectedCompleted, resultCompleted, "toString method should display correct status for a completed mosaic");
    }


}
