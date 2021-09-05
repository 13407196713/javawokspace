package ch05code;

public class Arrary2 {

	public static void main(String[] args) {
		int[] a = new int[] { 1, 2, 3, 4, 5 };
		int[] b = new int[] { 2, 3, 4, 5, 6, 7, 8 };
		for (int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "]=" + a[i]);
		}
		for (int j = 0; j < b.length; j++) {
			System.out.println("b[" + j + "]=" + b[j]);
		}
		System.out.println("a数组的长度是：" + a.length);
		System.out.println("b数组的长度是：" + b.length);
	}

}
