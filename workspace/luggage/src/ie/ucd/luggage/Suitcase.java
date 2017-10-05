package ie.ucd.luggage;

import java.util.ArrayList;

public class Suitcase extends Luggage {
	static double bagweight;
	public Suitcase(){
	         super();
	         items = new ArrayList<Item>();
	}

	@Override
	public double getBagWeight() {
		// TODO Auto-generated method stub
		return 30;
	}

	@Override
	public double getMaxWeight() {
		// TODO Auto-generated method stub
		return 500;
	}
	public static void add(Item item, Boolean password ){	
		if (password==false){
		items.add(item);	
		}
		else
			System.out.println("password is incorrect, "+item+"is very dangerous, it can not be added to the list");
	}
	public static void removeItem(int index, int password){
	    if(password==123456){
		items.remove(index);
	    }
	    else
	    	System.out.println("password is incorrect, this item can not be removed");
	}
	

}
