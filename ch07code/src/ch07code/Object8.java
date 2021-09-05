package ch07code;

public class Object8 {
	 public int sum(int x,int y,int z)             		            
	 {
		 int sum;                                         
	     return  sum=x+y+z;
	 }
	 public int aver(int x,int y,int z)          		            
	 {
		 int aver;                                       
	     return aver=(x+y+z)/3;                      
	 }
	 void print()                                		  	
	 {
		 System.out.println("这个就是这个同学的成绩"); 
	  }
	  public static void main(String[] args)    		               
	    {
		  Object8 num=new Object8();                    	          
	      System.out.println(num.sum(90,80,70));  		    
	 	  System.out.println(num.aver(90,80,70)); 		    
		  num.print();                                   		
	    }
}
