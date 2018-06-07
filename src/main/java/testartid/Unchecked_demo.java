package testartid;

public class Unchecked_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		try {
		int[] intarray= {1,2,3,4};
		int s = intarray[5];
		
		System.out.println(intarray[6]);
		System.out.println(s);
		}
		catch(ArrayIndexOutOfBoundsException  a) {
			System.out.println("in catch - "+a);
		//	a.getCause();
		//	a.getMessage().toString();
			a.printStackTrace();
		}
		
	//ArrayIndexOutOfBoundsException	
		
		
	}

}
