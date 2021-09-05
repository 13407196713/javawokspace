package ch05code;

public class Arrary3 {

	public static void main(String[] args) {
		int[] a = new int[] { 1, 2, 3, 4, 5 };
		int[] b = new int[] { 2, 3, 4, 5, 6 };
		int[] c = new int[5];                              
		for (int i = 0; i < a.length; i++) {
			c[i] = a[i] * b[i];
		}
		for (int j = 0; j < a.length; j++) {
			System.out.println("c[" + j + "]=" + (a[j] * b[j]));
		}
		System.out.println("a数组的长度是：" + a.length);
		System.out.println("b数组的长度是：" + b.length);
		System.out.println("c数组的长度是：" + c.length);
	}

}
