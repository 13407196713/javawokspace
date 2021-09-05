package ch15code;

public class AutoUnbox {
	public static void main(String[] args) {                  //主方法
		Integer data11 = new Integer(10); 			          //以前实现int类型转换成对象方式创建对象data11
		Integer data12 = new Integer(10);                     //创建对象data12
		Integer data21 = Integer.valueOf(10);		          //创建对象data21 以前实现int类型转换成对象方式
		Integer data22 = Integer.valueOf(10);                 //创建对象data22     
		//通过自动装箱方式实现int类型转换成对象方式
		Integer data31 = 20;
		Integer data32 = 20;
		//通过自动拆箱方式实现对象转换成int类型方式
		int sum1 = data11 + 20;
		int sum2 = data31 + 20;
		//输出变量sum1和sum2的值
		System.out.println("sum1的值为" + sum1);
		System.out.println("sum2的值为" + sum2);
		//查看对象是否引用同一个对象
		System.out.println("data11与data12是否为同一个对象?" + (data11 == data12));
		System.out.println("data21与data22是否为同一个对象?" + (data21 == data22));
		System.out.println("data31与data32是否为同一个对象?" + (data31 == data32));
	}


}
