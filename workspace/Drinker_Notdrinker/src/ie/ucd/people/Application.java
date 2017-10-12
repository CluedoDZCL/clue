package ie.ucd.people;

import ie.ucd.items.Wine;
import ie.ucd.items.WineType;
import ie.ucd.items.Juice;

public class Application {
	private static final WineType White = null;

	public static void main(String [] args){
		/* initial wine and juice and a drinker and a notdrinker */
		Wine wine = new Wine("vodka", 30.0, 50.0,White);
		Juice juice =new Juice("7up",20.0);
		Person drinker = new Drinker(20, "Tom", "Fagan");
		Person notdrinker=new NotDrinker(20,"James", "Watson");
		
		/*print out the personal information*/
		System.out.println("the drinker weight is "+drinker.getWeight());
		System.out.println("the notdrinker weight is "+notdrinker.getWeight());
		
		/* the drinker and notdrinker start drinking*/
	    /*drinker drinks wine*/
	    System.out.println("can the drinker drink wine? "+drinker.drink(wine));
	    System.out.println("is the drinker drunk? "+((Drinker) drinker).isDrunk());
	    
	    /*the notdrinker drinks wine and juice*/
	    System.out.println("can the notdrinker drink wine? "+notdrinker.drink(wine));
	    System.out.println("can him drink notalcoholic drinks? "+notdrinker.drink(juice));
	   
	    /*the drinker get drunk*/
	    for (int i=0;i<2;i++){
	    	drinker.drink(wine);
	    	System.out.println("he has been drinking "+((Drinker) drinker).getNumberofdrink());
	    	System.out.println("has him been drunk yet: "+((Drinker) drinker).isDrunk());
	    }
	}
}
