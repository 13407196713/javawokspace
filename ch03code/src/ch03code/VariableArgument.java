package ch03code;

public class VariableArgument {
	public static void main(String[] args){
	}
	public static int add(int... xs) {      
		int sum = 0;                          
		for (int x : xs) {        			         
			sum = sum + x;                 
		}
		return sum;            				
	}
}
