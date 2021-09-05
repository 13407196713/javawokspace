package ch09code;

public class Test3 {
	int x=2;                         				     
    public static void main(String[] args)		
    {
        Test3 t=new Test3();            			          
        Test3 t1=t;                      			     
        System.out.println("测试前的数据：");
        System.out.println("输出两个数据值：");
        System.out.println("t.x="+t.x);
        System.out.println("t1.x="+t1.x);
        System.out.println("测试后的数据：");
        t.x=3;                     					
        System.out.println("输出两个数据值：");
        System.out.println("t.x="+t.x);
        System.out.println("t1.x="+t1.x);
    }

}
