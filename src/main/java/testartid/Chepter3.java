package testartid;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Chepter3 {
	
	public Chapter3(){
		
	}
	
	public void roar( String roar1, StringBuilder roar2) {
		
		System.out.println(roar1.concat("!!!"));
		System.out.println(roar2.append("!!!"));
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Hello";
		"Hello".equals(s);
		String m = new String(s);
		if(s.equals(m)) {
			System.out.println("s ==m works");
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append("append").insert(1, "insert");
		System.out.println(sb);
		
		StringBuilder roar=new StringBuilder("roar");
		Chepter3 c3 = new Chepter3();
		c3.roar("roar", roar);
	
	
		
		System.out.println(s+false);
		String g = "0123456";
		System.out.println(g.substring(1,5));
		char[] c = new char[2];
		ArrayList l = new ArrayList();
		l.ensureCapacity(0);
		l.size();
		l.add("abc");
	//	l.remove(0);
		System.out.println(l.get(0));
		
		List<String> al = new ArrayList<String>();
		al.add("a1");
		
		
		int[] random = {13,34,12,-6,89};
		int x=12;
		int y = Arrays.binarySearch(random, x);
		System.out.println(y);
		
		
		List<Integer> list = Arrays.asList(10,4,-1,5);
		Collections.sort(list);
		Integer array[] = list.toArray(new Integer[4]);
		System.out.println(array[0]);
		
		String[] names = {"Tom","Dick","Harry"};
		
		LocalDate date = LocalDate.of(2014, 8, 21);
		System.out.println(date.toString());
		System.out.println(date);
		LocalDate ldate = LocalDate.of(2014, Month.AUGUST, 3);
		System.out.println(ldate.getYear()+""+ ldate.getMonth()+""+ldate.getDayOfYear());
		
		
		LocalDate lcdate = LocalDate.parse("2018-04-30", DateTimeFormatter.ISO_LOCAL_DATE);
		lcdate=lcdate.plusMonths(2);
		lcdate.plusDays(1);
		System.out.println(lcdate);
		
	}

}
