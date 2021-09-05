package ch05code;

public class Arrary4 {

	public static void main(String[] args) {
		int[] f = new int[20];                   
		f[0] = 0;                                      
		f[1] = 2;                                      
		for (int i = 2; i < f.length; i++) {
			f[i] = f[i - 1] + f[i - 2];           
		    System.out.println("f[" + i + "]=" + f[i]);
		}
	}
}
