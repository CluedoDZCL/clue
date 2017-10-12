package ie.ucd.items;

public class Juice extends NotAlcoholicDrink{
         private String name; 
         private double volume;
         public Juice(String name, double volume) {
        	 super(name, volume);
		      this.name=name;
		      this.volume=volume;
	}
	public String getName(){
		return name;
	}
	public double getVolume(){
		return volume;
	}

}
