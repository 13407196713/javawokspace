package ch07code;

import java.util.*;
public class GregorianCalendar1 {
	public static void main(String[] args)      
    {
		GregorianCalendar gc=new GregorianCalendar();    	
		gc.set(Calendar.YEAR,2019);                     	
		System.out.println(gc.get(Calendar.YEAR));       	
		}

}
