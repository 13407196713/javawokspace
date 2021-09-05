package ch09code;

public class Student1 {
	int x;
			int y;
			int z;
			void print(int x) {                   	
				System.out.println(2 * x);
			}
			void print(int x, int y) {           	     
				 System.out.println(2 * x + y);
			}
			void print(int x, int y, int z) {		     
				 System.out.println(2 * x + y * z);
			}
			void print(double a) {				
				 System.out.println(2 * a);
			}
			void print(double a, double b) {		
				 System.out.println(2 * a + b);
			}
			void print(double a, double b, double c) {	
				 System.out.println(2 * a + b + c);
			}
			public static void main(String[] args) {	
				 Student1 st = new Student1();		
				 st.print(2);
				 st.print(2, 3);
				 st.print(2, 3, 5);
				 st.print(1.1);
				 st.print(1.1, 2.2);
				 st.print(1.1, 2.2, 3.3);
			}

}
