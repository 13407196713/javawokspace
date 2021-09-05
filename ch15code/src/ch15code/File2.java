package ch15code;

public class File2 {
	public static void main(String[] args) {      //主方法
		//创建各种基本类型变量
		int a = 20;
		byte b = 'a';
		short c = 11;
		long d = 112;
		float e = 11.2f;
		double f = 11.3;
		//创建各种包装类对象
		Integer x1 = new Integer(a);
		Byte x2 = new Byte(b);
		Short x3 = new Short(c);
		Long x4 = new Long(d);
		Float x5 = new Float(e);
		Double x6 = new Double(f);
		//调用包装类的printin()方法实现输出
		System.out.println(x1);
		System.out.println(x2);
		System.out.println(x3);
		System.out.println(x4);
		System.out.println(x5);
		System.out.println(x6);
		//输出对象x1的二进制码
		System.out.println(x1.toBinaryString(a));
		//输出对象x1的十六进制码
		System.out.println(x1.toHexString(a));
	}


}
