package ie.ucd.luggage;

public class Suitcase extends Luggage {
	static double bagweight;
	public Suitcase(){
		
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
	
	

}
