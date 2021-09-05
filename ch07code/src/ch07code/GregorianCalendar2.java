package ch07code;
import java.util.*; 
public class GregorianCalendar2 {

	public static void main(String[] args) {
		GregorianCalendar gc=new GregorianCalendar();		
		gc.set(2019,10,14);                             		
		System.out.println(gc.get(Calendar.YEAR));        	
		System.out.println(gc.get(Calendar.MONTH));      	
		System.out.println(gc.get(Calendar.DATE));


	}

}
