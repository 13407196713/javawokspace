package ch11code;
import java.lang.reflect.Array;
import java.util.Arrays;
public class ArrayRef {
	public static void main(String[] args) {                 //主方法
		//创建了四种类型的数组
		int[] a1 = new int[] { 1, 2, 3 };       			//一维int型数组
		int[] a2 = new int[4];                    			//一维int型数组
		int[][] a3 = new int[2][3];                 		//二维int型数组
		String[] a4 = new String[] { "1", "2", "3" };	    //一维String型数组
		System.out.println("------------------------");
		//判断数组a1和数组a2的字节码是否相同
		System.out.println("a1与a2数组的字节码是否相同"+(a1.getClass() == a2.getClass()));
		//关于Array类的一些方法
		System.out.println("------------------------");
		System.out.println("a3数组的名字"+a3.getClass().getName());
		System.out.println("a1数组超类的名字"+a1.getClass().getSuperclass().getName());
		//关于数组与Object[]的对应关系
		Object obj1 = a1;
		// Object[] obj2=a1;
		Object boj3 = a4;
		Object[] boj4 = a4;
		Object boj5 = a3;
		Object[] boj6 = a3;
		System.out.println("------------------------");
		System.out.println("无工具类Arrays的输出"+a1);
		System.out.println("无工具类Arrays的输出"+a4);
		System.out.println("------------------------");
		//调用工具类Arrays的asList()方法
		System.out.println("有工具类Arrays的输出"+Arrays.asList(a1));
		System.out.println("有工具类Arrays的输出"+Arrays.asList(a4));
		System.out.println("------------------------");
		//调用printObject()方法
		printObject(a1);
		printObject(1);
	}
	//打印对象中成员方法
	private static void printObject(Object obj) {
		Class <?  extends Object> cla = obj.getClass();    				//获取字节码
		if (cla.isArray()) {                   		//判断是否为数组
			System.out.println("调用自定义方法的数组的输出");
			int len = Array.getLength(obj); 		//获取数组的长度
			for (int i = 0; i < len; i++) {   		//输出数组中的各个成员
				System.out.println(Array.get(obj, i));
			}
			System.out.println("------------------------");
		} else {
			System.out.println("调用自定义方法的普通对象的输出");
			System.out.println(obj);
			System.out.println("------------------------");
		}
	}

}
