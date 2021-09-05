package ch06code;

public class Str27 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("小明是一个优秀");
		sb.append("的程序员");
		sb.setLength(3);
		System.out.println(sb);   
	}
}
