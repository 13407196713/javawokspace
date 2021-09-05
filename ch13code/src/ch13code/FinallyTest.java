package ch13code;

public class FinallyTest {
	static int counter = 0; 	             //定义一个计数器
   public static void main(String[] args){ //主方法  
            //把try区块放入一个无限循环内，每次循环检查计数器的值，如果该值小于或等于2则抛
            //出自定义的异常，如果计数器的值大于2，则打印"No Exception"，并在finally子句内设置判
            //断子句，如果该值大于2则终止程序。
	    while(true){
	    try {
	         if(counter++<2)
	         throw new MyNewException();
	         System.out.println("No Exception");
	         }catch(MyNewException ex){
	         System.err.println("MyNewException happened");
	 }
	    //finally子句无论是否抛出异常都会执行
	    finally{
	         System.err.println("finally is called");
	    //判断是否退出程序，每次循环都做判断
	          if(counter>2) {
	                System.out.println("循环了【"+counter+"】次");
	                break;}
	             }
	         }
	     //一旦执行finally子句的break子句，则退出while循环，程序回到25行代码处继续执行
	     System.out.println("退出while循环 ");
	  }

}
