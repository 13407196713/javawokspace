package ch06code;

public class Str36 {

	public static void main(String[] args) {
		char[] c1 = { 'I', 'a', 'm', 'a', 'b', 'o', 'y' };
		char[] c2 = { 'h', 'e', 'i', 's', 'a', 'b', 'o', 'y' };
		String str1 = new String(c1);
		String str2 = new String(c2);
	    System.out.println(str1);
		System.out.println(str2);
		StringBuffer sb = new StringBuffer(str1);
		sb.append(str2);
		System.out.println(sb);
		System.out.println(sb.charAt(0));
		sb.setCharAt(0, 'y');
		sb.insert(1, 'o');
		sb.insert(2, 'u');
		System.out.println(sb);
		System.out.println(sb.substring(7));
		sb.reverse();
		System.out.println(sb);


	}

}
