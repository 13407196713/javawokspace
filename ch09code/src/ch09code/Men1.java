package ch09code;

public class Men1 extends Person1{
	int b;                                            
    Men1(int a,int b)                         		
    {
        super(a);                                     
        this.b=b;                             		   
    }
    public static void main(String[] args)     
    {
        Men1 m=new Men1(10,20);          		
        System.out.println(m.a+" "+m.b); 	
    }

}
