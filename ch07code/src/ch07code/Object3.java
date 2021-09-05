package ch07code;

public class Object3 {
	public void print()             				   
	{
		for(int i=0;i<=5;i++){
			for(int j=5-i;j>=0;j--){
				System.out.print("*");           
             }
		 System.out.println();                
		 }
	 }
	public static void main(String[] args)
	{
		Object3 pro=new Object3();           		 
		pro.print();                         		      
	}
}
