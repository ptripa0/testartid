package testartid;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileWithTryWithResourcesFinally {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	FileReader fr = null;
		File f = new File(System.getProperty("user.dir")+File.separator+"input.txt");
		
		try(FileReader fr = new FileReader(f)) {
			System.out.println("In try               ");
			
			char [] a = new char[50];
			fr.read(a);
			
			for(char c1: a) {
			System.out.println(c1);
			}
			
			
		} catch ( IOException e) {
			// TODO Auto-generated catch block
			System.out.println("In catch               ");
			e.printStackTrace();
		}
		finally {
				System.out.println("In finally               ");
				
			}
			
			
		}
		
		
		
	}


