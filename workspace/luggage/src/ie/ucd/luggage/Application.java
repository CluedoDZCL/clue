package ie.ucd.luggage;

import java.util.ListIterator;

public class Application extends Suitcase{
	public static void main(String [] args){
		Item B=new Bomb();
		Item P=new Pen();
		Item L=new Laptop();
		
		Luggage SL=new Suitcase();
		
		
		Boolean password1=B.isDangerous(); //I set the password as "false", which is got from the function"isDangerous"
		Boolean password2=P.isDangerous(); //which mean only the not dangerous thing will not be added in the luggage
		Boolean password3=L.isDangerous();
		
		Suitcase.add(B,password1);//the bomb wont be added in the safeluggage because the password is "true"
		Suitcase.add(P,password2);//it will be added to the safeluggage
		Suitcase.add(L,password3);
		
		Suitcase.removeItem(1, 12345); //password is incorrect, it should not be removed
		Suitcase.removeItem(0, 123456);//password is correct, the item will be removed
		
		double n=SL.getWeight(); //get the weight of the safe luggage and the suitcase itself
		double t=SL.getMaxWeight();
	ListIterator<Item> iter = items.listIterator();
	while(iter.hasNext()) {
	            System.out.print("the items in the safeluggage contains "+iter.next()+""+"¡¢");//print out all the items on the list
	        }
		
	System.out.println("the weight of the luggage is "+n+", it is lighter then ths maxweight of "+t+"");
	}

}
