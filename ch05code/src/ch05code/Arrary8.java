package ch05code;

public class Arrary8 {

	public static void main(String[] args) {
		int[] a = new int[] { 2, 4, 6, 8, 10 };
		int[] b = new int[] { 1, 3, 5, 7, 9 };
		int[] c = new int[5];
		for (int i = 0; i < a.length; i++) {      			  
			c[i] = a[i] * b[i];
		}
		for (int j = 0; j < a.length; j++) {         			   
			System.out.println("c[" + j + "]=" + (a[j] * b[j]));
		}
		System.out.println("c数组的长度是：" + c.length);		     
	}

}
