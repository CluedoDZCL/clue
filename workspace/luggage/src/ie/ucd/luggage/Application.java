package ie.ucd.luggage;

import java.util.ListIterator;

public class Application extends Safeluggage implements Item{
	public static void main(String [] args){
		Item B=new Bomb();
		Item P=new Pen();
		Item L=new Laptop();
		Safeluggage SL=new Safeluggage();
		Boolean password1=B.isDangerous(); //I set the password as "false", which is got from the function"isDangerous"
		Boolean password2=P.isDangerous(); //which mean only the not dangerous thing will not be added in the luggage
		Boolean password3=L.isDangerous();
		Safeluggage.add(B,password1);//the bomb wont be added in the safeluggage because the password is "true"
		Safeluggage.add(P,password2);//it will be added to the safeluggage
		Safeluggage.add(L,password3);
		
		Safeluggage.removeItem(1, 12345); //password is incorrect, it should not be removed
		Safeluggage.removeItem(1, 123456);//password is correct, the item will be removed
		
	ListIterator<Item> iter = items.listIterator();
	while(iter.hasNext()) {
	            System.out.print("the items in the safeluggage contains "+iter.next()+""+"¡¢");//print out all the items on the list
	        }
	}	

}
