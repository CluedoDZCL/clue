package ie.ucd.luggage;
/**
 * Interface representing the luggage item
 * @author liliana
 *
 */
public interface Item {
	/**
	 * 
	 * @return the item type
	 */
	String getType();
	
	/**
	 * 
	 * @return the item weight
	 */
	double getWeight();
	
	/**
	 * 
	 * @return whether the item is dangerous or not
	 */
	boolean isDangerous();

}
