package ch03code;

public class Var {
	int a=10;                                    			    
	int b=21;  
	public static void main(String[] args) {                                    		    
		var v = new Var();                                   
		System.out.println("这个是全局变量a="+v.a);   
		v.print();                                          
		}
		void print()                                            
		{
		int c=20;                              				
		System.out.println("这个是局部变量c="+ c);
		}
	}
