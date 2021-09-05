package ch06code;

public class Str11 {

	public static void main(String[] args) {
		char[] c = { 'c', 'h', 'i', 'n', 'e', 's', 'e' };
		char[] c1 = { 'h', 'a', 'n', 'd', 'l', 'e' };
		String str1 = new String(c, 0, 4);
		String str2 = new String(c1, 1, 1);
		System.out.println(str1.concat(str2));
	}

}
