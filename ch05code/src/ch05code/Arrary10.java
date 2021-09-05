package ch05code;

public class Arrary10 {
	int[] a = new int[] { 2, 4, 6, 8, 10 };
			int[] b = new int[] { 1, 3, 5, 7, 9 };
			public static void main(String[] args) {          	 
				Arrary10 w = new Arrary10();               			     
				w.print1();
				w.print2();
				w.print3();
				w.print4();
			}
			void print1() {                                   		
				for (int i = 0; i < b.length; i++) {                   	          
					System.out.println("b[" + i + "]=" + b[i]);
				}
				System.out.println("数组b的长度是：" + b.length);	
			}
			void print2() {                                         	
				for (int i = 0; i < a.length; i++) {             	                
					System.out.println("a[" + i + "]=" + a[i]);
				}
				System.out.println("数组a的长度是：" + a.length); 	
			}
			void print3() {                                         	
				//因为数组c和b相同，可以用b.length
				for (int i = 0; i < b.length; i++) {
					System.out.println("c[" + i + "]=" + (b[i] * a[i]));
				}
				System.out.println("数组c的长度是：" + b.length);
			}
			void print4() {                                        
				for (int i = 0; i < b.length; i++) {
					System.out.println("d[" + i + "]=" + (a[i] * a[i] * b[i] - b[i]));
				}
			}




}
