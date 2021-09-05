package ch07code;
import java.util.*;
public class Calendar1 {

	public static void main(String[] args) {
		GregorianCalendar gc=new GregorianCalendar();       
		String now=gc.get(Calendar.YEAR)+"年"+(gc.get(Calendar.MONTH)+1)+"月"+gc.get(Calendar.DATE)+"日"+gc.get(Calendar.HOUR)+"时"+gc.get(Calendar.MINUTE)+"分" + gc.get(Calendar.SECOND)+"秒";                   
		System.out.println("当前时间是："+now);    
	}

}
