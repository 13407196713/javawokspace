package ch07code;

public class Object5 {

	 public void print2()             				     
	     {
	        for(int i=5;i>0;i--)             			
	 	        {
		            for(int k=0;k<=(5-i);k++)
		            {
	                System.out.print(" ");              
		            }
	             for(int j=1;j<=(2*i-1);j++)
		            {
	 	                System.out.print("*");              
	             }
	 	            System.out.println();                   
	 	        }
		    }
	     public void print1()              			          
		    {
	 	        for(int i=1;i<=5;i++)          			
	 	        {
	 	            for(int j=0;j<=(5-i);j++)
	 	            {
	                System.out.print(" ");              
	 	            }
	 	            for(int k=1;k<=(2*i-1);k++)
	 	            {
		                System.out.print("*");              
	 	            }
		            System.out.println();                 
		        }
	 	    }
	 	    public static void main(String[] args)		     
	 	    {
	 	        Object5 pro=new Object5();       		
		        pro.print1();                    		
	 	        pro.print2();                   		
		    }
}
