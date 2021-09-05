package ch04code;

public class Control7 {
	public static void main(String[] args)           
	    { 
	        for(int x=1;x<10;x++)              			        
	        {
	            for(int y=1;y<=x;y++)           		             
	            {
	                System.out.print(x+"*"+y+"="+(x*y)+"\t");  
	                if (x==y) {
	                	System.out.println();
	                }
	            }
	           System.out.println("");                      
	        }
	     }

}
