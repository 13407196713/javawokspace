package ch08code;

public class Overload1 {
	void print()
	    {
	        System.out.println("你好");
		}
	    void print(String name)
	    {
	        System.out.println(name+",你好");
		}
	    void print(String name,int age)
	    {
	        System.out.println(name+",你好,你有"+age+"岁了");
		}
	    public static void main(String args[])  
    { 
	        Overload1 o=new Overload1();   			
	        o.print();                               
	        o.print("王华");
	        o.print("王华",30);
	    }

}
