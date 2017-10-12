package ie.ucd.people;

import ie.ucd.items.AlcoholicDrink;
import ie.ucd.items.Drink;
import ie.ucd.items.Food;


public class Drinker extends Person {
	private int numberOFDRINK = 0;
    protected String firstname;
    protected String lastname;
    
	public Drinker(int w, String firstName, String lastName) {
		setWeight(w);
		this.firstname=  firstName;
		this.lastname = lastName;
		
	}
	

	@Override
	public boolean drink(Drink drink) {
		
		if (drink instanceof AlcoholicDrink)
			// TODO Auto-generated method stub
			numberOFDRINK +=1;
		return true;
		}


	@Override
	public boolean eat(Food arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isDrunk() {
		return numberOFDRINK > (getWeight() / 10);

	}
	public int getNumberofdrink(){
		return numberOFDRINK;
	}
	

}
