package testartid;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class FirstChapter {
	
	
	public FirstChapter() {
		
	}

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
	
		File f1 = new File("C:\\Users\\prabodh.tripathi\\testworkspace\\input1.txt");
		System.out.println(f1.length());
		f1.canRead();
		
		try {
			FileInputStream fi = new FileInputStream(f1);
			fi.read();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("inside FileNotFoundException");
			
		}
		catch (IOException i) {
			i.printStackTrace();
			System.out.println("Inside IOException");
		}
		
		
//		FileInputStream in = new FileInputStream(System.getProperty("user.dir")+File.separator+"input1.txt");
//		FileOutputStream out = new FileOutputStream(System.getProperty("user.dir")+File.separator+"output.txt");
		
		
	//	System.out.println(in.read());
	//	System.out.println(in.toString());
		
//		int a;
//		while((a = in.read()) != -1) {
//			System.out.println(a);
//			out.write(a);
		
//		}
	
		
//		FileReader r = new FileReader(System.getProperty("user.dir")+File.separator+"input.txt");
//		FileWriter w = new FileWriter(System.getProperty("user.dir")+File.separator+"output.txt");
		
	/*	int b;
		while((b=r.read()) != -1) {
		w.write(b);	
		}
		
		System.out.println(b);
	*/	
	//	InputStreamReader isr = null;
		
	//	isr = InputStreamReader(System.in);
	
		
	//	OutputStreamWriter(System.out);
		
	//	System.out.println(isr);
	//	System.out.println(osw);
		
		
		
	}

}
