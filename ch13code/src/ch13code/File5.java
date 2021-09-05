package ch13code;

public class File5 {
	public static void main(String[] args)throws Exception	       //抛出异常
    {
        int[] a=new int[5];                  				        //创建数组对象a
        try                                                         //捕获异常
        {
            a[10]=1;                                			      //赋值
        }
        catch(ArrayIndexOutOfBoundsException ae)  		           //抛出异常对象
        {
            System.out.println(ae);
        }
        catch(ArrayStoreException ae)          			           //抛出异常对象
        {
            System.out.println(ae);
        }
        catch(ArithmeticException ae)         				     //抛出异常对象
        {
            System.out.println(ae);
        }
        finally                                   //finally子句无论是否抛出异常都会执行执行的语句
        {
            System.out.println("发现了异常，并且处理它了!");
        }
    }

}
