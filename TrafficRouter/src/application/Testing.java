package application;


public class Testing {

	public static void main (String args[]){
		Stoplight A = new Stoplight("1001", new int[]{50,40,20} , "Straight");
		System.out.println(A.getDirection());
	}
}
