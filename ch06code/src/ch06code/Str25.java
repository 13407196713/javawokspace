package ch06code;

public class Str25 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer(40);
		System.out.println(sb.capacity());     	 
		sb.ensureCapacity(100);               	          
		System.out.println(sb.capacity());  


	}

}
