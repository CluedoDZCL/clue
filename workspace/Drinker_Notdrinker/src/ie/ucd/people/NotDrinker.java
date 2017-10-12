package ie.ucd.people;

import ie.ucd.items.Drink;
import ie.ucd.items.Food;
import ie.ucd.items.NotAlcoholicDrink;

public class NotDrinker extends Person {
	protected String firstName;
    protected String lastName;
    
    public NotDrinker(int w, String firstName, String lastName){
    	setWeight(w);
		this.firstName= firstName;
		this.lastName = lastName;
		
    }
	@Override
	public boolean drink(Drink drink) {
		return drink instanceof NotAlcoholicDrink;
	/*	if (drink instanceof AlcoholicDrink ){
			// TODO Auto-generated method stub
		return false;
		}
		else
		return true;
		// TODO Auto-generated method stub
		*/
	}

	@Override
	public boolean eat(Food arg0) {
		// TODO Auto-generated method stub
		return false;
	}

}
