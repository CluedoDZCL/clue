package ie.ucd.luggage;
import java.util.ArrayList;

import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Safeluggage extends Luggage implements Item{
	public static List<Item> items;
	public Safeluggage(){
		items = new ArrayList<Item>();
	}
	@Override
	public double getBagWeight() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getMaxWeight() {
		// TODO Auto-generated method stub
		return 0;
	}
	public String getType() {
		// TODO Auto-generated method stub
		return null;
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
	
	public static void main(String [] args){
		Item B=new Bomb();
		Item P=new Pen();
		Item L=new Laptop();
		Safeluggage SL=new Safeluggage();
		Boolean password1=B.isDangerous();
		Boolean password2=P.isDangerous();
		Boolean password3=L.isDangerous();
		Safeluggage.add(B,password1);
		Safeluggage.add(P,password2);
		Safeluggage.add(L,password3);
		ListIterator<Item> iter = items.listIterator();
		 while(iter.hasNext()) {
	            System.out.print(iter.next()+"¡¢");
	        }
	}	
	}
	
