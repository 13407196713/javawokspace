package ch05code;

public class Arrary5 {

	public static void main(String[] args) {
		char[][] a;
		a = new char[4][10];
		a[0] = new char[10];
		a[1] = new char[10];
		a[2] = new char[10];
		a[3] = new char[10];
		a[0][0] = 65;
		a[1][0] = 67;
		a[2][0] = 69;
		a[3][0] = 71;
		for (int i = 0; i < a.length; i++) {
			for (int j = 1; j < a[i].length; j++) {
				a[i][j] = (char) (a[i][j - 1] + 1);
				System.out.print(a[i][j - 1]);
			}
			System.out.println();   				         
		}


	}

}
