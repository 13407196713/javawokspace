package ch06code;

import java.io.UnsupportedEncodingException;

public class Str6 {

	public static void main(String[] args) {
		byte[] b = { 97, 98, 99, 100, 101, 102 };
		try {
			String str = new String(b, 3, 2, "utf-8");
		    System.out.println(str);
		} catch (UnsupportedEncodingException ex) {  
		}


	}

}
