package ie.ucd.luggage;
import java.util.ArrayList;
import java.util.List;

/**
 * This class represents a generic Luggage
 * containing different items
 * @author liliana
 *
 */

public abstract class Luggage {
	/**
	 * The list of contained items
	 */
	private List<Item> items;
	
	/**
	 * The constructor initialises the 
	 * list of contained items
	 */
	public Luggage(){
		items = new ArrayList<Item>();
	}
	
	/**
	 * Adds an item to the contained list
	 * of items
	 * @param item The item to be added
	 */
	public void add(Item item){		
		items.add(item);
	}
	
	/**
	 * Returns the weight of the bag without its content
	 * @return the weight of the bag
	 */
	public abstract  double getBagWeight();
	
	/**
	 * Returns the list of items contained in the bag
	 * @return the list of items
	 */
	public List<Item> getContents(){
		return items;
	}
	
	/**
	 * Returns the total weight of the bag plus its contained list of items
	 * @return
	 */
	public double getWeight(){
		double weight = 0;
		for(Item i: items){
			weight += i.getWeight();
		}
		weight += getBagWeight();
		return weight;
	}
	
	/**
	 * Returns the maximum total weight of the bag
	 * @return max allowed weight of the bag
	 */
	public abstract double getMaxWeight();
	
	
	/**
	 * It removes the item at a specified index
	 * @param index
	 */
	public void removeItem(int index){
		items.remove(index);
	}
	
	/**
	 * Returns true if the luggage contains at least one dangerous item
	 * @return whether the luggage contains a dangerous item
	 */
	//TO BE COMPLETED
	public boolean isDangerous(){
		return false;
	}
	

}
