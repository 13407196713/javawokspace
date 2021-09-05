package ch05code;

public class Arrary9 {

	public static void main(String[] args) {
		int[] a = new int[] { 2, 4, 6, 8, 10 };
		int[] b = new int[] { 1, 3, 5, 7, 9 };
		for (int i = 0; i < b.length; i++) {
			System.out.println("d[" + i + "]=" + (a[i] * a[i] * b[i] - b[i]));
		}
	}

}
