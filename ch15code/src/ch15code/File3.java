package ch15code;

public class File3 {
	public static boolean isNumberic(String str) {              //创建一个isNumberic方法
		try {                            		                //捕获异常
			Integer i = new Integer(str);  	                    //创建一个包装类的对象x1
		} catch (NumberFormatException e) {
			return false;
		}
		return true;                      			            //返回布尔型对象
	}
	public static void main(String[] args) { 	                 //主方法
		//输出方法isNumberic()的运行结果
		System.out.println(isNumberic("123"));
		System.out.println(isNumberic("-123.34"));
		System.out.println(isNumberic("0x12"));
		System.out.println(isNumberic("453"));
		System.out.println(isNumberic("1abcd"));
		System.out.println(isNumberic("-1a33"));
	}


}
