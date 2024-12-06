/**
 * Mosaic.java
 */
package atulab.ie.ghmvntst;

/**
 * Mosaic class
 * Used for storing Mosaic information
 * 
 * @author L00172488
 */
public class Mosaic {
    private String name; //the name of the mosaic
	private int neededItems; //total items needed 
    private boolean mosaicCompleted; //checks if the mosaic is completed

    //constructor with parameters
    public Mosaic(String name, int neededItems) {
        this.name = name;
        this.neededItems = neededItems;
        this.mosaicCompleted = false;//default to not completed
    }

    //default constructor with no parameters
    public Mosaic() {
        this.name = "";//default name
        this.neededItems = 0;//default needed items
        this.mosaicCompleted = false;//default to not completed
    }
     
    
    /**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the neededItems
	 */
	public int getNeededItems() {
		return neededItems;
	}

	/**
	 * @param neededItems the neededItems to set
	 */
	public void setNeededItems(int neededItems) {
		this.neededItems = neededItems;
	}

	/**
	 * @return the mosaicCompleted
	 */
	public boolean isMosaicCompleted() {
		return mosaicCompleted;
	}

	/**
	 * @param mosaicCompleted the mosaicCompleted to set
	 */
	public void setMosaicCompleted(boolean mosaicCompleted) {
		this.mosaicCompleted = mosaicCompleted;
	}

	@Override
	public String toString() {
	    if (mosaicCompleted) {
	        return name + " map is completed.";
	    } else {
	        return name + " map is not completed yet, " + neededItems + " shards remaining.";
	    }
	}
	
	


}
