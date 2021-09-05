package ch04code;

public class Control8 {

	public static void main(String[] args) {
		int x=0;                                      
		int y=100;                                   
		int sum=0;                                    
		while(y>0){
			x=x+1;
		    y--;							  
		    sum+=x;
		}
        System.out.println(sum);
	}
}
