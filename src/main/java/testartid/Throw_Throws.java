package testartid;

import java.rmi.RemoteException;

import javax.naming.InsufficientResourcesException;

public class Throw_Throws {

	public static void main(String[] args) throws RemoteException, InsufficientResourcesException{
		// TODO Auto-generated method stub

		System.out.println("throwing remote exception explicitly by Throw keyword......");
		try {
			throw new RemoteException();
						
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			System.out.println("Inside catch block.........");
			e.printStackTrace();
		}
		
		
		try {
			throw new InsufficientResourcesException();
			
		} 
		catch (InsufficientResourcesException is) {
			System.out.println("Inside insufficient fund exception catch block..............");
			is.printStackTrace();
		}
		
		
		finally {
			System.out.println("Inside finally block for clean-up statements.................................");
		}
		
		
	}

}
