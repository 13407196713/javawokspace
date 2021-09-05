package ch09code;

public class Student {
	int x;
	int y;
	int z;
	void print1(int x) {                 	  
		System.out.println(2 * x);
	}
	void print2(int x, int y) {         	        
		System.out.println(2 * x + y);
	}
	void print3(int x, int y, int z) {     	           
		System.out.println(2 * x + y * z);
	}
	void print4(double a) {              		
		System.out.println(2 * a);
	}
	void print5(double a, double b) {    	          
		System.out.println(2 * a + b);
	}
	void print6(double a, double b, double c) {       
		System.out.println(2 * a + b + c);
	}
	public static void main(String[] args) { 	  
		Student st = new Student();  		          
		st.print1(2);
		st.print2(2, 3);
		st.print3(2, 3, 5);
		st.print4(1.1);
		st.print5(1.1, 2.2);
		st.print6(1.1, 2.2, 3.3);
	}

}
