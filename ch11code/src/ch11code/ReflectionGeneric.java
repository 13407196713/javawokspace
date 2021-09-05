package ch11code;
import java.util.ArrayList;                           //导入相应的包
import java.lang.reflect.InvocationTargetException; 
public class ReflectionGeneric {
	public static void main(String[] args) throws IllegalArgumentException, SecurityException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
		ArrayList<Integer> arry1 = new ArrayList<Integer>();         //创建集合arry1
		//添加两个整数型数字
		arry1.add(27);
		arry1.add(29);
		//通过反射向集合中添加字符型abc
		arry1.getClass().getMethod("add", Object.class).invoke(arry1, "abc");
		//输出集合中的各个元素
		System.out.println("第一个元素为："+arry1.get(0));
		System.out.println("第二个元素为："+arry1.get(1));
		System.out.println("第三个元素为："+arry1.get(2));
	}

}
