package ch06code;

public class Str5 {

	public static void main(String[] args) {
		byte[] b = { 97, 98, 99, 100, 101, 102 };
		String str = new String(b, 3, 2);
		System.out.println(str);	
	}

}
