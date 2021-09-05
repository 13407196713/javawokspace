package ch04code;

public class Control10 {
	public static void main(String[] args) {    
		int x = 1;                                   
		do {

			if ((3 * x) % 5 != 0) {
				if ((3 * x) % 9 != 0) {			     
					System.out.println(3 * x); 
				}
			}
			x++;                                     
		} while (((3 * x > 1) && (3 * x < 100)));	
	}

}
