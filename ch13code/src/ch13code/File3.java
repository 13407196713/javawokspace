package ch13code;

public class File3 {
	public static double quotient(int numerator,int denominator)throws  DivideByZeroException       			 //抛出异常
	    {
	        if(denominator==0)         		         //当参数denominator为0时
	        throw new DivideByZeroException();	     //创建异常对象DivideByZeroException
	        else
	        return (double)numerator;  			     //返回变量numerator
	    } 
   public static void main(String[] args)	     //主方法
   {
            try                				     //捕获异常
            {
                double result=quotient(3,0);	 //调用方法quotient()
            }
            catch(DivideByZeroException exception)  //处理异常
            {
                System.out.println(exception.toString());
            }
   }
    public static class DivideByZeroException extends ArithmeticException //定义一个DivideByZeroException类继承ArithmeticException
    {
        /**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public DivideByZeroException()		//构造函数
        {
            super("不能被0除");   				//调用父类的构造函数
        }
    }


}
